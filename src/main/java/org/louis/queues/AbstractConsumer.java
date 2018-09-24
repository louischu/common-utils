package org.louis.queues;

import org.louis.chainable.ChainableService;

import java.util.concurrent.BlockingQueue;

/**
 * Created by luyenchu on 6/24/16.
 */
public abstract class AbstractConsumer<T> implements Runnable {

    private final BlockingQueue<T> queue;
    private ChainableService<T> processor;

    public AbstractConsumer(BlockingQueue<T> q, ChainableService<T> processor) {
        queue = q;
        this.processor = processor;
    }

    public void run() {
        try {
            while (true) {
                consume(queue.take());
            }
        } catch (InterruptedException ex) {
            handleInterruptedException(ex);
        }
    }

    public void consume(T value) {
        processor.process(value);
    }

    public void handleInterruptedException(InterruptedException ex) {

    }
}
