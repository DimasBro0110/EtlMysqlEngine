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
                        "prod/application-prod-config.xml"
                );

        JobLauncher jobProdLauncher = (JobLauncher) applicationContext.getBean("jobLauncher");
        Job prodJob = (Job) applicationContext.getBean("prodJob1");

        try{
            JobExecution jobExecution = jobProdLauncher.run(prodJob, new JobParameters());
            System.out.println("Exit Status : " + jobExecution.getStatus());
        }catch (Exception ex){
            ex.printStackTrace();
        }

    }

}
