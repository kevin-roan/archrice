#include<stdio.h>
#include<stdlib.h>
  int main(void) 

{ 
	int a[100];
	int i,limit;
	int value;

	printf("enter the limit:");
	scanf("%d",&limit);
	printf("enter elements to array:");
	for(i=0;i<limit;i++) { 
		scanf("%d",&a[i]); }
	printf("the Array elements are: ");
	for(i=0;i<limit-1;i++){ 
        printf("%d ,",a[i]); }
        printf("%d",a[i]);


	return 0; 

}	
