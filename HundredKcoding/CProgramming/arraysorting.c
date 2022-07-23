#include<stdio.h>
#include<stdlib.h>
int main(void)
{
	 int limit,a[100],i,j,temp;
	 printf("limit:");
	 scanf("%d",&limit);

	 printf("enter elements to array:");
	 for(i=0;i<limit;i++) {
		  scanf("%d",&a[i]);

	 }

	 for(i=0;i<limit-1;i++) {
		 for(j=i+1;j<limit;j++) {
			 if(a[i]>a[j])
			 { temp=a[i];
			   a[i]=a[j];
			   a[j]=temp; } } }
printf("Sorted Order:");
for(i=0;i<limit;i++) {
	printf("%d",a[i]); }

	return 0;

}
