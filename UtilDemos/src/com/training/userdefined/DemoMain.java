package com.training.userdefined;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class DemoMain {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
         Policy policy1=new Policy("JivanSathi", "Life", "LIC");
         Policy policy2=new Policy("JivanAnand", "Motor", "Acko");
         Policy policy3=new Policy("Insurance", "Wealth", "Voya");
         Policy policy4=new Policy("InvestMentPlan", "InvestMent", "Star");
         Policy policy5=new Policy("HomeInsurance", "Home", "VoyaFinancial");
         
         List<Policy> policyList=new ArrayList<>();
         policyList.add(policy1);
         policyList.add(policy2);
         policyList.add(policy3);
         policyList.add(policy4);
         policyList.add(policy5);
         
         Iterator<Policy> iterator=policyList.iterator();
         while(iterator.hasNext()) {
        	
        	 Policy policy=iterator.next();
        	 System.out.println("policy "+policy);
         } 
        	 Scanner sc=new Scanner(System.in);
        	 System.out.println("Enter the type");
        	
        	List<Policy> policyByType=new ArrayList<>();
        	 @SuppressWarnings("unused")
			String policyType=sc.next();
        	 for(Policy policy:policyList) {
        		 if(policy.getType().equals(policyType)) {
        			 policyByType.add(policy);
        			
        		 }
        		
        	 }
        	 for(Policy type:policyByType) {
        		 System.out.println(type);
        	 }
        	sc.close();
         }
	}
	


