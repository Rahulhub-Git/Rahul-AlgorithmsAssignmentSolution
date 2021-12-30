package com.greatlearning.main;
import com.greatlearning.service.SearchSortService;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SearchSortService S1= new SearchSortService();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no of companies");
		int noOfCompanies;
		noOfCompanies=s.nextInt();
		
		double currStkpriceArr[]=new double[noOfCompanies];
		boolean currStkpriceMore[]=new boolean[noOfCompanies];
		for(int i=0;i<noOfCompanies;i++) {
			System.out.println("Enter current stock price of the company "+(i+1));
		currStkpriceArr[i]=s.nextDouble();
		System.out.println("Whether company's stock price rose today compare to yesterday?");
		currStkpriceMore[i]=s.nextBoolean();
		}
		
		int option;
		System.out.println("-------------------------------------------------------");
		System.out.println("Enter the operation that you want to perform");
		
		System.out.println("1. Display the companies stock prices in ascending order");
		
		System.out.println("2. Display the companies stock prices in descending order");
		
		System.out.println("3. Display the total no of companies for which stock prices rose today");
		
		System.out.println("4. Display the total no of companies for which stock prices declined today");
		
		System.out.println("5. Search a specific stock price");
		
		System.out.println("press 0 to exit");
		
		System.out.println("-------------------------------------------------------");
		
		option=s.nextInt();
		while(option!=0) 
		{
			
		switch(option) {
		case 1:
			S1.mergesortAce(currStkpriceArr,0, noOfCompanies-1 );
		      for(int i=0;i<noOfCompanies;i++)
		    	  System.out.print(currStkpriceArr[i]+"  ");
		      System.out.println();
		break;
		case 2:
			S1.mergesortDes(currStkpriceArr,0, noOfCompanies-1);
			for(int i=0;i<noOfCompanies;i++)
			System.out.print(currStkpriceArr[i]+"  ");
			System.out.println();
		break;
		case 3:
		    S1.StkRise(currStkpriceMore);
		break;
		case 4:
		    S1.StkDecline(currStkpriceMore);
		break;
		
		case 5:
		       S1.stkSearch(currStkpriceArr);
		break;
		
		default:
			System.out.println("Please enter a valid Option");
		    break;
		}
		
		System.out.println("-------------------------------------------------------");
		
		System.out.println("Enter the operation that you want to perform");
		
		System.out.println("1. Display the companies stock prices in ascending order");
		
		System.out.println("2. Display the companies stock prices in descending order");
		
		System.out.println("3. Display the total no of companies for which stock prices rose today");
		
		System.out.println("4. Display the total no of companies for which stock prices declined today");
		
		System.out.println("5. Search a specific stock price");
		
		System.out.println("press 0 to exit");
		
		System.out.println("-------------------------------------------------------");
		
		
		option=s.nextInt();
		
		continue;
	    
		
	
	
	
		}
		if(option==0)
			System.out.println(" Exited Successfully ");
			
	
   }
	
}


