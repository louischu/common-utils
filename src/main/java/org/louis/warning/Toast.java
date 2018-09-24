package org.louis.warning;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Created by luyenchu on 6/24/16.
 */
public class Toast {
    static final Logger LOG = LoggerFactory.getLogger(Toast.class);
    ScheduledExecutorService executorService;

    public void inform(int interval, final String message) {

        executorService = Executors.newSingleThreadScheduledExecutor();
        executorService.scheduleWithFixedDelay(new Runnable() {
            @Override
            public void run() {
                LOG.info(message);
            }
        }, interval, interval, TimeUnit.SECONDS);
    }

    public void stop() {
        if (executorService != null) {
            executorService.shutdown();
        }
    }
}
