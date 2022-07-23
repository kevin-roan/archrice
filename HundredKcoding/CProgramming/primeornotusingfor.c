#include<stdio.h>
#include<stdlib.h>
int main(void)
{ int i;
  int a;
  int flag=0;

  printf("enter the element:");
  scanf("%d",&a);

  for(i=2;i<a;i++) { 
	  if(a%i==0) { 
		  flag=1;
		  break; } } 
  if(flag==0) 
  { printf("Number is Prime"); } 
  else 
	 printf("number is not prime:");
  return 0;
  } 

