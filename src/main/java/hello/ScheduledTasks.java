package hello;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by deb on 18/8/16.
 */
@Component
public class ScheduledTasks {
    private static final SimpleDateFormat date = new SimpleDateFormat("HH:mm:ss");
    @Scheduled(fixedRate = 5000)
    public void currentTime(){
        System.out.println("Now the time is : "+date.format(new Date()));
    }

}
