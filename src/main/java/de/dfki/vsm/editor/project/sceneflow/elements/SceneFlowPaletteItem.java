package de.dfki.vsm.editor.project.sceneflow.elements;

import de.dfki.vsm.PreferencesDesktop;

import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.dnd.*;
import java.awt.event.MouseAdapter;
import java.io.IOException;

public final class SceneFlowPaletteItem extends JLabel implements Transferable {
   
    private final String mToolTipText;
    private final ImageIcon mStandardIcon;
    private final ImageIcon mRollOverIcon;
    private final ImageIcon mDragIcon;
    private final Object mDragableData;

    // Drag & drop support
    private final DragSource mDragSource;
    private final TransferHandler mTransferHandler;
    private final DragGestureListener mDragGestureListener;
    private final DragSourceListener mDragSourceListener;

    // Create a sceneflow element item
    public SceneFlowPaletteItem(final String text, final String info, final ImageIcon stdIcon, final ImageIcon rollIcon, final ImageIcon dragIcon, final Object data) 
    {
        mToolTipText = text;
        //ICONS
        mStandardIcon = stdIcon;
        mRollOverIcon = rollIcon;
        mDragIcon     = dragIcon;
        mDragableData = data;
        //setContentAreaFilled(false);
        setFocusable(false);
        setOpaque(false);

        // to be transferred in the Drag
        mTransferHandler = new TransferHandler(text);
        setTransferHandler(mTransferHandler);
        setHorizontalAlignment(JLabel.CENTER);
        setToolTipText(mToolTipText + ": " + info);
        setPreferredSize(PreferencesDesktop.SF_PALETTEITEM_SIZE);
        setMinimumSize(PreferencesDesktop.SF_PALETTEITEM_SIZE);
        setMaximumSize(PreferencesDesktop.SF_PALETTEITEM_SIZE);
        setIcon(mStandardIcon);
        addMouseListener(new MouseAdapter() {

            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                setIcon(mRollOverIcon);
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                setIcon(mStandardIcon);
            }
        });
        mDragSourceListener = new DragSourceListener() {
            @Override
            public void dragEnter(DragSourceDragEvent dsde) {
//                System.out.println("drag enter");
            }

            @Override
            public void dragOver(DragSourceDragEvent dsde) {

//                System.out.println("drag over");
            }

            @Override
            public void dropActionChanged(DragSourceDragEvent dsde) {
//                System.out.println("drag action changed");
            }

            @Override
            public void dragExit(DragSourceEvent dse) {

//                System.out.println("drag exit");
            }

            @Override
            public void dragDropEnd(DragSourceDropEvent dsde) {
//                System.out.println("drag drop end");
            }
        };
        mDragGestureListener = new DragGestureListener() {
            @Override
            public void dragGestureRecognized(DragGestureEvent event) {
                Image cursorIcon = mDragIcon.getImage();
                Cursor cur = Toolkit.getDefaultToolkit().createCustomCursor(cursorIcon, new Point(10, 10), mToolTipText);
                mDragSource.startDrag(event, cur, (SceneFlowPaletteItem) event.getComponent(), mDragSourceListener);
            }
        };
        // The Drag will copy the DnDButton rather than moving it
        mDragSource = new DragSource();
        mDragSource.createDefaultDragGestureRecognizer(this, DnDConstants.ACTION_COPY, mDragGestureListener);
    }

    // Get the data for a drag & drop operation
    @Override
    public final Object getTransferData(final DataFlavor flavor) throws UnsupportedFlavorException, IOException {
        return mDragableData;
    }

    // Generally support all d&d data flavours
    @Override
    public final boolean isDataFlavorSupported(final DataFlavor flavor) {
        return true;
    }

    //
    @Override
    public final DataFlavor[] getTransferDataFlavors() {
        return null;
    }

//    @Override
//    public final Icon getIcon() {
//        return mStandardIcon;
//    }

//    @Override
//    public final Icon getRolloverIcon() {
//        return mRollOverIcon;
//    }
}
