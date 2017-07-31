package com.dimas.brosalin;

import com.mysql.jdbc.jdbc2.optional.SuspendableXAConnection;
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

//        Job prodJobAccountsPlan = (Job) applicationContext.getBean("prodJobAccountsPlan");
//        Job prodJobDimCampaign = (Job) applicationContext.getBean("prodJobDimCampaign");
//        Job prodJobDimCustomer = (Job) applicationContext.getBean("prodJobDimCustomer");
//        Job prodJobPersonalCredRequest = (Job) applicationContext.getBean("prodJobDimPersonalCreditRequest");
//        Job prodJobDimProductGroup = (Job) applicationContext.getBean("prodJobDimProductGroup");
//        Job prodJobDimProductSubgroup = (Job) applicationContext.getBean("prodJobDimProductSubgroup");
//        Job prodJobFactAccountOperCDW = (Job) applicationContext.getBean("prodJobFactAccountOperCdw");
//        Job prodJobFactActivity = (Job) applicationContext.getBean("prodJobFactActivity");
//        Job prodJobFactCampaignActivityMember = (Job) applicationContext.getBean("prodJobFactCampaignActivityMember");
//        Job prodJobFactCase = (Job) applicationContext.getBean("prodJobFactCase");
//        Job prodJobFactCaseDeals = (Job) applicationContext.getBean("prodJobFactCaseDeal");
//        Job prodJobFactCaseIncident = (Job) applicationContext.getBean("prodFactCaseIncident");
//        Job prodJobFactCaseProductRequest = (Job) applicationContext.getBean("prodFactCaseProductRequest");
//        Job prodJobFactDeals = (Job) applicationContext.getBean("prodJobFactDeals");
//        Job prodJobFactDLCards = (Job) applicationContext.getBean("prodJobFactDlCards");
//        Job prodJobIBLoginHistory = (Job) applicationContext.getBean("prodJobFactIbLoginHistory");
//        Job prodJobFactIncident = (Job) applicationContext.getBean("prodJobFactIncident");
//        Job prodJobFactIntelligentOpportunity = (Job) applicationContext.getBean("prodJobFactIntelligentOpportunity");
//        Job prodJobFactMonthlyPension = (Job) applicationContext.getBean("prodJobFactMonthlyPension");
//        Job prodJobFactMonthlySalary = (Job) applicationContext.getBean("prodJobFactMonthlySalary");
//        Job prodJobFactProductRequest = (Job) applicationContext.getBean("prodJobFactProductRequest");
//        Job prodJobFactRequestFromSite = (Job) applicationContext.getBean("prodJobFactProductRequestFromSite");
//        Job prodJobFactSalaryProject = (Job) applicationContext.getBean("prodJobFactSalaryProject");
//        Job prodJobFactTransactions_CDW = (Job) applicationContext.getBean("prodJobFactTransations_CDW");

        Job prodJobParallel = (Job) applicationContext.getBean("flowJob");

        try{

            JobExecution jobExecutionParallel = jobProdLauncher.run(prodJobParallel, new JobParameters());
            System.out.println("Exit status of Parallel : " + jobExecutionParallel.getStatus());

//            JobExecution jobExecutionAccountsPlan = jobProdLauncher.run(prodJobAccountsPlan, new JobParameters());
//            System.out.println("Exit status of AccountsPlan : " + jobExecutionAccountsPlan.getStatus());

//            JobExecution jobExecutionDimCampaign = jobProdLauncher.run(prodJobDimCampaign, new JobParameters());
//            System.out.println("Exit status of DimCampaign job : " + jobExecutionDimCampaign.getStatus());
//
//            JobExecution jobExecutionDimCustomer = jobProdLauncher.run(prodJobDimCustomer, new JobParameters());
//            System.out.println("Exit status of DimCustomer job : " + jobExecutionDimCustomer.getStatus());
//
//            JobExecution jobExecutionPersonalCreditRequest = jobProdLauncher.run(prodJobPersonalCredRequest, new JobParameters());
//            System.out.println("Exit status of PersonalCreditRequest job : " + jobExecutionPersonalCreditRequest.getStatus());
//
//            JobExecution jobExecutionDimProductGroup = jobProdLauncher.run(prodJobDimProductGroup, new JobParameters());
//            System.out.println("Exit status of DimProductGroup job : " + jobExecutionDimProductGroup.getStatus());
//
//            JobExecution jobExecutionDimProductSubgroup = jobProdLauncher.run(prodJobDimProductSubgroup, new JobParameters());
//            System.out.println("Exit status of DimProductSubgroup job : " + jobExecutionDimProductSubgroup.getStatus());
//
//            JobExecution jobExecutionFactAccountOperCDW = jobProdLauncher.run(prodJobFactAccountOperCDW, new JobParameters());
//            System.out.println("Exit status of FactAccountOperCDW job : " + jobExecutionFactAccountOperCDW.getStatus());
//
//            JobExecution jobExecutionFactActivity = jobProdLauncher.run(prodJobFactActivity, new JobParameters());
//            System.out.println("Exit status of FactActivity job : " + jobExecutionFactActivity.getStatus());
//
//            JobExecution jobExecutionFactCampaignActivityMember = jobProdLauncher.run(prodJobFactCampaignActivityMember, new JobParameters());
//            System.out.println("Exit status of FactCampaignActivityMember job : " + jobExecutionFactCampaignActivityMember.getStatus());
//
//            JobExecution jobExecutionFactCase = jobProdLauncher.run(prodJobFactCase, new JobParameters());
//            System.out.println("Exit status of FactCase job : " + jobExecutionFactCase.getStatus());
//
//            JobExecution jobExecutionFactCaseDeals = jobProdLauncher.run(prodJobFactCaseDeals, new JobParameters());
//            System.out.println("Exit status of FactCaseDeals job : " + jobExecutionFactCaseDeals.getStatus());
//
//            JobExecution jobExecutionFactCaseIncident = jobProdLauncher.run(prodJobFactCaseIncident, new JobParameters());
//            System.out.println("Exit status of FactCaseIncident job : " + jobExecutionFactCaseIncident.getStatus());
//
//            JobExecution jobExecutionFactCaseProductRequest = jobProdLauncher.run(prodJobFactCaseProductRequest, new JobParameters());
//            System.out.println("Exit status of FactCaseProductRequest job : " + jobExecutionFactCaseProductRequest.getStatus());
//
//            JobExecution jobExecutionFactDeals = jobProdLauncher.run(prodJobFactDeals, new JobParameters());
//            System.out.println("Exit status of FactDeals job : " + jobExecutionFactDeals.getStatus());
//
//            JobExecution jobExecutionFactDLCards = jobProdLauncher.run(prodJobFactDLCards, new JobParameters());
//            System.out.println("Exit status of FactDLCards job : " + jobExecutionFactDLCards.getStatus());
//
//            JobExecution jobExecutionIBLoginHistory = jobProdLauncher.run(prodJobIBLoginHistory, new JobParameters());
//            System.out.println("Exit status of IBLoginHistory job : " + jobExecutionIBLoginHistory.getStatus());
//
//            JobExecution jobExecutionFactIncident = jobProdLauncher.run(prodJobFactIncident, new JobParameters());
//            System.out.println("Exit status of FactIncident job : " + jobExecutionFactIncident.getStatus());
//
//            JobExecution jobExecutionFactIntelligentOpportunity = jobProdLauncher.run(prodJobFactIntelligentOpportunity, new JobParameters());
//            System.out.println("Exit status of FactIntelligentOpportunity job : " + jobExecutionFactIntelligentOpportunity.getStatus());
//
//            JobExecution jobExecutionFactMonthlyPension = jobProdLauncher.run(prodJobFactMonthlyPension, new JobParameters());
//            System.out.println("Exit status of FactMonthlyPension job : " + jobExecutionFactMonthlyPension.getStatus());
//
//            JobExecution jobExecutionFactMonthlySalary = jobProdLauncher.run(prodJobFactMonthlySalary, new JobParameters());
//            System.out.println("Exit status of FactMonthlySalary job : " + jobExecutionFactMonthlySalary.getStatus());
//
//            JobExecution jobExecutionFactProductRequest = jobProdLauncher.run(prodJobFactProductRequest, new JobParameters());
//            System.out.println("Exit status of FactProductRequest job : " + jobExecutionFactProductRequest.getStatus());
//
//            JobExecution jobExecutionFactRequestFromSite = jobProdLauncher.run(prodJobFactRequestFromSite, new JobParameters());
//            System.out.println("Exit status of FactRequestFromSite job : " + jobExecutionFactRequestFromSite.getStatus());
//
//            JobExecution jobExecutionFactSalaryProject = jobProdLauncher.run(prodJobFactSalaryProject, new JobParameters());
//            System.out.println("Exit status of FactSalaryProject job : " + jobExecutionFactSalaryProject.getStatus());
//
//            JobExecution jobExecutionFactTransactions_CDW = jobProdLauncher.run(prodJobFactTransactions_CDW, new JobParameters());
//            System.out.println("Exit status of FactTransactions_CDW job : " + jobExecutionFactTransactions_CDW.getStatus());

        }catch (Exception ex){
            ex.printStackTrace();
        }

    }

}
