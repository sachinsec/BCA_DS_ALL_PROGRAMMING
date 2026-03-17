// Write a program that will read n and calculate the following series
//sum = 1+2+3+....+n   sum of n natural numbers
#include <stdio.h>
int main(){
int n,sum=0;
printf("Enter number:\n");
scanf("%d",&n);
for (int i = 0; i <= n; i++)
{
    sum += i;
}
printf("Sum of series is = %d",sum);

    return 0;
}