package com.yll;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.Duration;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Ch51RibbonLoadbalancerApplicationTests {

    @Test
    public void contextLoads() {
        String str = "qwertyuqwert1546451654845132132456784652561515fdsafenjkshdiuwhfbckjdsafkjbjnlkjoiheihfncknck";
        int w = str.indexOf('w');
        System.out.println("字符位置：" + w);
        Instant start = Instant.now();
        int i = lengthOfLongestSubstring(str);
        Instant end = Instant.now();
        System.out.println(i);
        System.out.println(Duration.between(start, end).toMillis());
    }

    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int ans = 0, i = 0, j = 0;
        while (i < n && j < n) {
            // try to extend the range [i, j]
            if (!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
            }
            else {
                set.remove(s.charAt(i++));
            }
        }
        return ans;
    }


    public class Timertest extends TimerTask {

        private String jobName;
        public Timertest(String jobName) {
            this.jobName = jobName;
        }

        @Override
        public void run() {
            System.out.println("任务名：" + jobName);
        }
    }

    @Test
    public void testTimer() {
        Timer timer = new Timer();
        long delay1 = 1*1000;
        long per1 = 1000;
        timer.schedule(new Timertest("job1"), delay1, per1);
        long delay2 = 2*1000;
        long per2 = 2000;
        timer.schedule(new Timertest("job2"), delay2, per2);
    }

    public class ScheduledExecutorTest implements  Runnable {

        private String jobName;
        public ScheduledExecutorTest(String jobName) {
            this.jobName = jobName;
        }

        @Override
        public void run() {
            System.out.println("任务名：" + jobName);
        }
    }

    @Test
    public void testScheduledExecutor() {
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(6);
        long delay1 = 1;
        long per1 = 1;
        executorService.scheduleAtFixedRate(new ScheduledExecutorTest("job1"), delay1, per1, TimeUnit.SECONDS);
        long delay2 = 1;
        long per2 = 1;
        executorService.scheduleWithFixedDelay(new ScheduledExecutorTest("job2"), delay2, per2, TimeUnit.SECONDS);
    }

}
