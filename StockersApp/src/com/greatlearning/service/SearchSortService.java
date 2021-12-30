package com.greatlearning.service;
import java.util.Scanner;
public class SearchSortService {

	public void Amerger(double arr[],int L,int R,int M)
	{
		int n1=M-L+1;
		int n2=R-M;
		
		double LeftArr[]= new double[n1];
		double RightArr[]=new double[n2];
		
		for(int i=0;i<n1;i++)
	     LeftArr[i]=arr[L+i];
	     
	    
	     
		for(int j=0;j<n2;j++)
		RightArr[j]=arr[M+1+j];
		
		
		int i=0;
		int j=0;
		int k=L;
		
		while(i<n1 && j<n2)
		{
			if(LeftArr[i]<= RightArr[j]) 
			{
				arr[k]=LeftArr[i];
			i++;
			}
			else
			{
				arr[k]=RightArr[j];
			     j++;
			}
			k++;
		}
			while(i<n1)
			{
				arr[k]=LeftArr[i];
				i++;
				k++;
				
			}
			while(j<n2) {
				
				arr[k]=RightArr[j];
				j++;
				k++;
			}
			
			
		
		
		
		
		
	}
	//Ascending Order using Merge Sort
		public void mergesortAce(double arr[],int left,int right) {
			if(left<right) { 
			int mid = (left+right)/2;
			
			mergesortAce(arr,left,mid);
			mergesortAce(arr,mid+1,right);
			
			Amerger(arr,left,right,mid);
			
			
			}
			
		
	}

		public void Dmerger(double arr[],int L,int R,int M)
		{
			int n1=M-L+1;
			int n2=R-M;
			
			double LeftArr[]= new double[n1];
			double RightArr[]=new double[n2];
			
			for(int i=0;i<n1;i++)
		     LeftArr[i]=arr[L+i];
		     
		    
		     
			for(int j=0;j<n2;j++)
			 RightArr[j]=arr[M+1+j];
			
			
			int i=0;
			int j=0;
			int k=L;
			
			while(i<n1 && j<n2)
			{
				if(LeftArr[i]>= RightArr[j])
				{
					arr[k]=LeftArr[i];
				i++;
				}
				else
				{
					arr[k]=RightArr[j];
				     j++;
				}
				k++;
			}
				while(i<n1)
				{
					arr[k]=LeftArr[i];
					i++;
					k++;
					
				}
				while(j<n2) {
					
					arr[k]=RightArr[j];
					j++;
					k++;
				}
				
				
			
			
			
			
			
		}
		
		//Descending order Using Merge Sort
			public void mergesortDes(double arr[],int left,int right) {
				if(left<right) { 
				int mid = (left+right)/2;
				
				mergesortDes(arr,left,mid);
				mergesortDes(arr,mid+1,right);
				
				Dmerger(arr,left,right,mid);
				
				
				}
				
			
		}
			
			//Method to check the Stock price Rise
   public void StkRise(boolean Stkboolval[]) {
   int count=0;
   for(int i=0;i<Stkboolval.length;i++)
   {
	   if(Stkboolval[i]==true)
		   count++;
   }
   System.out.println("Total no of companies whose stock prices rose today :"+count);

   }
   //Method to check Stock price Declined
   public void StkDecline(boolean Stkboolval[]) {

   int count=0;
   for(int i=0;i<Stkboolval.length;i++)
   {
	   if(Stkboolval[i]==false)
		   count++;
   }
   
   System.out.println("Total no of companies whose stock price declined today :"+count);
   
	   
	   
   }
   //method to Search a specific Stock
   public void stkSearch(double stocksPrice[]) 
   {
	   Scanner s1=new Scanner(System.in);
	   double stkElement;
	   int flag=0;
	   System.out.println("Enter the stock to search");
	   stkElement=s1.nextDouble();
	   for(int i=0;i<stocksPrice.length;i++)
	   {
		   if(stocksPrice[i]==stkElement) 
			  {
			   System.out.println("Stock of value "+stocksPrice[i]+" is present"); 
		       flag=1;
		      }
	   }
	   if (flag==0)
	   System.out.println("The Stock is not found");
   }
   
}
