package de.dfki.vsm.runtime.players;

import de.dfki.vsm.runtime.values.AbstractValue;
import de.dfki.vsm.runtime.plugins.RunTimePlugin;
import java.util.LinkedList;

/**
 * @author Gregor Mehlmann
 */
public abstract class RunTimePlayer implements RunTimePlugin {

    // Play with given arguments
    public abstract void play(final String name, final LinkedList<AbstractValue> args);

    // A single task of the player
    protected class Task extends Thread {

        // The termination flag
        private volatile boolean mIsDone;

        // Abort the execution
        public final void abort() {
            //
            mIsDone = true;
            //
            interrupt();
        }

        // Check execution status
        public final boolean isDone() {
            return mIsDone;
        }

        // Construct with a name
        protected Task(final String name) {
            super(name);
            // Initialize the flag
            mIsDone = false;
        }
    }
}
