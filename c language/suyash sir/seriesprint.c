// Write a program that will read n and calculate the sum of the following series
// sum = 1a+2a+3a+.....+na
#include<stdio.h>
int main(){
int a,n,sum=0;
printf("Enter number\n");
scanf("%d",&n);
// printf("Enter the value of a.");
// scanf("%d",&a);
printf("1a");
for (int i = 2; i <= n ; i++)
{
    printf(" + %da ",i);
}
return 0;
}