package de.dfki.vsm.xtesting.NewPropertyManager.util;

import de.dfki.stickmanfx.StickmanStageFX;
import de.dfki.vsm.model.project.AgentConfig;
import de.dfki.vsm.model.project.ProjectConfig;
import de.dfki.vsm.runtime.project.RunTimeProject;
import de.dfki.vsm.xtesting.NewPropertyManager.model.AbstractTreeEntry;
import de.dfki.vsm.xtesting.NewPropertyManager.model.EntryAgent;
import de.dfki.vsm.xtesting.NewPropertyManager.model.EntryPlugin;
import de.dfki.vsm.xtesting.NewPropertyManager.util.events.ContextEvent;
import de.dfki.vsm.xtesting.NewPropertyManager.util.events.DeleteContextEventAgent;
import de.dfki.vsm.xtesting.NewPropertyManager.util.events.DeleteContextEventPlugin;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.MenuItem;

import java.util.LinkedList;

/**
 * Created by alvaro on 5/14/16.
 */
public class ContextTreeItem extends AbstractTreeItem implements TreeObservable{
    private LinkedList<TreeObserver> observers = new LinkedList<>();
    private String contextValue = "Agent";
    private String pluginName;
    private AbstractTreeEntry entryItem;
    public ContextTreeItem(String name) {
        this.setValue(name);
    }
    public static int agentCounter = 1;
    public String contextName;
    private RunTimeProject mProject;
    private String getContextValueName(){
        String name = contextValue + agentCounter;
        contextName = name;
        return name;
    }

    public ContextTreeItem(AbstractTreeEntry item) {
        entryItem = item;
        this.setValue(entryItem.getName());
    }

    public ContextTreeItem(AbstractTreeEntry item, RunTimeProject projectConfig) {
        entryItem = item;
        mProject = projectConfig;
        this.setValue(entryItem.getName());
    }

    public AbstractTreeEntry getEntryItem(){
        return entryItem;
    }

    @Override
    public ContextMenu getMenu(){
        ContextMenu menu = new ContextMenu();
        if(entryItem instanceof EntryPlugin) {
            MenuItem addNewAgent = getAddNewAgentItem();
            menu.getItems().add(addNewAgent);
            if(((EntryPlugin)entryItem).getPluginConfig().getClassName().contains("Stickman")){
                MenuItem editStickman = getEditStickmanItem((EntryPlugin) entryItem);
                menu.getItems().add(editStickman);
            }
        }

        MenuItem deleteItem = getDeleteItem();
        menu.getItems().add(deleteItem);
        return menu;
    }

    private MenuItem getEditStickmanItem(EntryPlugin plugin) {
        MenuItem editStickman = new MenuItem("Edit Stickman");
        editStickman.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Thread stickmanLaunchThread = new Thread() {
                    public void run() {
                        try {
                            launchStickmanConfiguration(plugin);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                };


                stickmanLaunchThread.start();
            }
        });
        return  editStickman;
    }

    private void launchStickmanConfiguration(EntryPlugin plugin) {
        StickmanStageFX.clearStage();
        if(mProject == null){
            addStickmanFromPlugin(plugin);
        }else{
            addStickmanFromProject();
            mProject.getProjectConfig().getAgentConfigList();
        }
        StickmanStageFX.lauchStickmanConfig(mProject.getProjectPath());
    }

    private void addStickmanFromProject() {
        for (AgentConfig agent: mProject.getProjectConfig().getAgentConfigList()) {
            if (agent.getDeviceName().equalsIgnoreCase("stickman")) {
                StickmanStageFX.addStickmanFX(agent.getAgentName());
            }
        }
    }

    private void addStickmanFromPlugin(EntryPlugin plugin) {
        for (EntryAgent agent: plugin.getAgents()) {
            AgentConfig ac = agent.getAgentConfig();
            if (ac.getDeviceName().equalsIgnoreCase("stickman")) {
                StickmanStageFX.addStickmanFX(ac.getAgentName());
            }
        }
    }

    private MenuItem getAddNewAgentItem(){
        MenuItem addNewAgent = new MenuItem("Add new agent");
        addNewAgent.setOnAction(new EventHandler() {
            public void handle(Event t) {
                EntryAgent agent = new EntryAgent(getContextValueName());
                AbstractTreeItem newBox = new ContextTreeItem(agent, mProject);
                agent.setContextTreeItem(newBox);
                getChildren().add(newBox);
                agentCounter++;
                notifyObserver(agent);
                newBox.getParent().setExpanded(true);
            }
        });
        return  addNewAgent;
    }

    private MenuItem getDeleteItem(){
        MenuItem deleteItem = new MenuItem("Delete " + entryItem.getName());
        deleteItem.setOnAction(new EventHandler() {
            public void handle(Event t) {
                AbstractTreeEntry item = getEntryItem();
                if(item instanceof EntryAgent){
                    notifyObserverOnDeleteAgent(item);
                }else if(item instanceof EntryPlugin){
                    notifyObserverOnDeletePlugin(item);
                }
            }
        });
        return  deleteItem;
    }


    @Override
    public void registerObserver(TreeObserver object) {
        observers.add(object);
    }

    @Override
    public void unregisterObserver(TreeObserver object) {
        observers.remove(object);
    }

    @Override
    public void notifyObserver() {
        for (TreeObserver observer:observers) {
            observer.update(new ContextEvent(contextName, this.getValue().toString(), entryItem));
        }
    }

    public void notifyObserver(AbstractTreeEntry entry) {
        for (TreeObserver observer:observers) {
            observer.update(new ContextEvent(contextName, this.getValue().toString(), entry));
        }
    }

    private void notifyObserverOnDeleteAgent(AbstractTreeEntry entry) {
        for (TreeObserver observer:observers) {
            observer.update(new DeleteContextEventAgent(entry));
        }
    }

    private void notifyObserverOnDeletePlugin(AbstractTreeEntry entry) {
        for (TreeObserver observer:observers) {
            observer.update(new DeleteContextEventPlugin(entry));
        }
    }

    public String getPluginName() {
        return pluginName;
    }
}


