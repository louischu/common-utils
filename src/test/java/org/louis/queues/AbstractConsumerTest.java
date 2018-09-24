package org.louis.queues;

import org.junit.Test;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by luyenchu on 6/30/16.
 */
public class AbstractConsumerTest {
    @Test
    public void shouldCallOneAndMethodCanBeCalled() {
        BlockingQueue<String> blockingQueue = new LinkedBlockingQueue<>();
        LogChainableService chainableService = new LogChainableService();
        SampleConsumer consumer = new SampleConsumer(blockingQueue, chainableService);
        Thread t1 = new Thread(consumer);
        Thread t2 = new Thread(consumer);
        t1.start();
        t2.start();

        for (int i = 0; i < 100; i++) {
            try {
                blockingQueue.put("Bonjour " + i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //No assert ?
    }
}
