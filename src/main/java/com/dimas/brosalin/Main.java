package com.dimas.brosalin;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by DmitriyBrosalin on 18/07/2017.
 */
public class Main {

    public static void main(String[] args){

        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext(
                        "test/appliation-context.xml"
                );

        JobLauncher jobLauncher = (JobLauncher) applicationContext.getBean("jobLauncher");
        Job job = (Job) applicationContext.getBean("customJob1");
        Job job1 = (Job) applicationContext.getBean("customJob2");

        try{
            JobExecution jobExecution = jobLauncher.run(job, new JobParameters());
            JobExecution jobExecution1 = jobLauncher.run(job1, new JobParameters());
            System.out.println("Exit Status : " + jobExecution.getStatus());
            System.out.println("Exit Status : " + jobExecution1.getStatus());
        }catch (Exception ex){
            ex.printStackTrace();
        }

    }

}
