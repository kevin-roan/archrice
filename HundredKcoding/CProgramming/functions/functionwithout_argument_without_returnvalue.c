#include<stdio.h>
#include<stdlib.h>
void sum();
int main(void)
{ 
	sum();
	return 0; } 
void sum() {
	 int a,b,sum;
	 printf("enter first value:");
	 scanf("%d",&a);
	 printf("enter second value:");
	 scanf("%d",&b);
	 sum=a+b;
	 printf("The result is: %d",sum);

} 




