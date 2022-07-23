#include<stdio.h>
#include<stdlib.h>
int main(void)
{ 
     int a[10];
     int i;
     int limit;
     int searchkey,flag=0;
     
     printf("enter the Limit");
     scanf("%d",&limit);
     printf("enter elements to the Array:");
     for(i=0;i<limit;i++) { 
	      scanf("%d",a[i]); }
     //asking user a searchKey
     printf("Enter the Element You Want To Search:");
     scanf("%d",&searchkey);
     
     //for loop to seach for the element 
     for(i=0;i<limit;i++){
	     if(searchkey==a[i]) 
		     flag=1;
	      break; }
     if (flag=1)
        { printf("The element Found At Position %d",i+1); } 
     else
     printf("Item Not Found");


      return 0;

     } 

