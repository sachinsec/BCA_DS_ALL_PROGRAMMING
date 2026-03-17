// Write a program that will read n and calculate the sum of the following series
// sum = 1a+2a+3a+.....+na
#include<stdio.h>
int main(){
int a,n,sum=0;
printf("Enter number\n");
scanf("%d",&n);
printf("Enter the value of a\n");
scanf("%d",&a);
for (int i = 1; i <= n ; i++)
{
    sum += i*a;
    printf("Sum is = %d\n",sum);
}
return 0;
}