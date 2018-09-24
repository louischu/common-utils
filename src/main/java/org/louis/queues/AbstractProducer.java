package org.louis.queues;

import java.util.concurrent.BlockingQueue;

/**
 * Created by luyenchu on 6/24/16.
 */
public abstract class AbstractProducer<T> implements Runnable {
    private final BlockingQueue<T> queue;

    public AbstractProducer(BlockingQueue<T> q) {
        queue = q;
    }

    @Override
    public void run() {
        try {
            while (true) {
                queue.put(produce());
            }
        } catch (InterruptedException ex) {
            handleInterruptedException(ex);
        }
    }

    abstract T produce();

    public void handleInterruptedException(InterruptedException ex) {

    }
}
