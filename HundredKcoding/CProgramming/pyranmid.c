#include<stdio.h>
#include<stdlib.h>
int main(void)
{
	 int i,j;
         int n=5;
	 for(i=0;i<n;i++){ 
                 // j=0, j<0+1=1 true; p(*);
		 for(j=0;j<i+1;j++){
	         // now j=0,and i=0, so if case true, break;
	

			 printf("*");
                          if(j==i)
			 { printf("\n");
				 break;
			 }
			 //now j=0,i=0
		 }
	//now i=1,j=0;
	//now i=2,j=0;
	 }

	 return 0;
	  }
