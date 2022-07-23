#include<stdio.h>
#include<stdlib.h>
int sum(int,int);
int main(void) {
int a,b,c;
printf("Enter values of a & b ;");
scanf("%d %d",&a,&b);
c=sum(a,b);
printf("%d",c);
return 0;
}
int sum(int num1,int num2)
{ 
	int b;
	b=num1+num2;
	
	return b;
} 
