#include<stdio.h>
#include<stdlib.h>
int main(void)
{
	 int a[3][3];
	 int i,j;
//         int limit;
	 printf("Enter elements to array:");
	 
	 for(i=0;i<3;i++){ 
		 for(j=0;j<3;j++) { 
			 scanf("%d",&a[i][j]); } 
	 } 

	printf("Array Values are:\n");
        for(i=0;i<3;i++)
	{ for(j=0;j<3;j++)
	   
	printf("%d \t",a[i][j]); 
        printf("\n");	}  

	return 0;
} 
