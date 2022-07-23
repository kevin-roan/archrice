#include<stdio.h>
#include<stdlib.h>
void sum(int,int);
int main(void) { 
	int a,b;
	printf("Enter elements:");
	scanf("%d %d",&a,&b);
	sum(a,b);
       	//senting a and b to sum function:
        return (0); } 
void sum(int valueofa,int valueofb) {

	int actualsum;
	actualsum=valueofa+valueofb;
	printf("Result is: %d",actualsum);
} 


