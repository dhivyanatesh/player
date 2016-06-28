#include<stdio.h> 
main() 
{ 
int no, rem, flag=0; 
printf("\nEnter a Number: "); 
scanf("%d",&no); 
while(no>2) 
{ 
rem=no%2; 
if(rem==1) 
{ 
flag=1; 
break; 
} 
else 
no=no/2; 
} 
if(flag==1) 
printf("\nNo is not Power of two."); 
else 
printf("\nNo is Power of two"); 
} 
