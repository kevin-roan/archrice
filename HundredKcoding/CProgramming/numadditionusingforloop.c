#include<stdio.h>
#include<stdlib.h>
int main(void)
{ 
//	int a;
        int limit;
	int sum=0;
	int i;

	printf("enter the limit :");
	scanf("%d",&limit);

	for(i=0;i<limit+1;i++) { 
		sum=sum+i; } 
	printf("The sum of Elements: %d",sum);
	
	return 0; 


} 
