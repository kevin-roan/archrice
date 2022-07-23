#include<stdio.h>
#include<stdlib.h>
int main(void)
{ 
	int limit;
        int i;
	printf("Enter limit:");
	scanf("%d",&limit);

	for(i=2;i<limit+1;i++) {
		if(i%2==0) { 
		printf("%d\t",i);}}
 
	return 0;
} 
