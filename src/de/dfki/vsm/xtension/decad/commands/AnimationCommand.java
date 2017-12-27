package de.dfki.vsm.xtension.decad.commands;

import de.dfki.vsm.runtime.activity.AbstractActivity;
import de.dfki.vsm.xtension.decad.builders.AnimationBuilder;

import java.io.IOException;


public class AnimationCommand extends DecadCommand {


    public AnimationCommand(AbstractActivity activity) {
        super(activity);
    }

    @Override
    public void execute() {
        try {
            httpClient.openUrl(buildAnimationUrl())
                    .get()
                    .read();
        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
        }
    }

    private String buildAnimationUrl() {
        AnimationBuilder builder = new AnimationBuilder();

        return builder
                .animation()
                .animate(activity.getName())
                .build();
    }
}
