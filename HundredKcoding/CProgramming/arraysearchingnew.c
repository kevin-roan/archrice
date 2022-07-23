#include<stdio.h>
#include<stdlib.h>
int main(void)
{ int a[100],i,flag=0,searchkey,limit;

	printf("enter limit:");
	scanf("%d",&limit);
	printf("enter elements to the array:");
	for(i=0;i<limit;i++) {
		scanf("%d",&a[i]); }
	printf("enter element you want to search:");
	scanf("%d",&searchkey);
	for(i=0;i<limit;i++){
		if(searchkey==a[i]) {
				 flag=1;
				 	 break; }
	}
	if(flag==1)
		 printf("item found at %d",i+1);

	else
			printf("item not found");
	return 0;




}

