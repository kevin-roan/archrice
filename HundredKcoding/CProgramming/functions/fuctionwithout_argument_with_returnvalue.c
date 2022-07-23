#include<stdio.h>
#include<stdlib.h>
int sum();
int main(){ 
	int k;
	k=sum();
	printf("result is %d",k);
	return 0; 
} 

int sum() {
        int result;	
	int num1,num2;
	printf("Enter Numbers:");
	scanf("%d %d",&num1,&num2);
	result=num1+num2;
	return result;
}
