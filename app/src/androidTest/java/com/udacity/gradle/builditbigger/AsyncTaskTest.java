package com.udacity.gradle.builditbigger;

import android.support.test.runner.AndroidJUnit4;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.CountDownLatch;

@RunWith(AndroidJUnit4.class)
public class AsyncTaskTest {

    @Test
    public void testAsyncTask() {
        final CountDownLatch signal = new CountDownLatch(1);
        new EndpointsAsyncTask(new EndpointsAsyncTask.JokeCallback() {
            @Override
            public void onFinished(String result) {
                if (result == null || result.isEmpty()) {
                    Assert.fail();
                }
                signal.countDown();
            }
        }).execute();
        try {
            signal.await();
        } catch (InterruptedException e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

}
