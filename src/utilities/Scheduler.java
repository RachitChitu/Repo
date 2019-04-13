package utilities;

import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.SchedulerException;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;

public class Scheduler {

	public static void main(String[] args) throws SchedulerException{
		// TODO Auto-generated method stub
		JobDetail j = JobBuilder.newJob(RunTestNG.class).build();
		Trigger t= TriggerBuilder.newTrigger().withIdentity("CroneTrigger")
				.withSchedule(SimpleScheduleBuilder.simpleSchedule().withIntervalInHours(2).repeatForever())
				.build();
		
		org.quartz.Scheduler s=StdSchedulerFactory.getDefaultScheduler();
		s.start();
		s.scheduleJob(j, t);
		
		
	}

}
