package org.louis.queues;

import org.louis.chainable.ChainableService;

import java.util.concurrent.BlockingQueue;

/**
 * Created by luyenchu on 6/30/16.
 */
public class SampleConsumer extends AbstractConsumer<String> {

    public SampleConsumer(BlockingQueue<String> q, ChainableService<String> processor) {
        super(q, processor);
    }

}

class LogChainableService extends ChainableService<String> {

    @Override
    protected String processData(String body) {
        System.out.println(body + ", by: " + Thread.currentThread().getName());
        return body;
    }
}