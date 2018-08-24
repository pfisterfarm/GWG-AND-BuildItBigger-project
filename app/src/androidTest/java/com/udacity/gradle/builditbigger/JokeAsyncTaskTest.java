package com.udacity.gradle.builditbigger;

import android.support.test.runner.AndroidJUnit4;

import com.udacity.gradle.builditbigger.backend.myJokeApi.model.Joke;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertTrue;

@RunWith(AndroidJUnit4.class)
public class JokeAsyncTaskTest implements JokeAsyncTask.Callback {

    private CountDownLatch countDownLatch = new CountDownLatch(1);

    @Test
    public void testNonEmpty() {
        JokeAsyncTask testFetch = new JokeAsyncTask(this);
        testFetch.execute();
        try {
            countDownLatch.await(30, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void jokeFetched(String fetchedJoke) {
        assertNotNull(fetchedJoke);
        assertTrue(!fetchedJoke.equals(""));
        countDownLatch.countDown();
    }
}
