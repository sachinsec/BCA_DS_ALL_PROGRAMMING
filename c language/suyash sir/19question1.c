//Write a program that will read n and display sum of digits of n.
#include <stdio.h>
int main(){
int n,a=1,digit,sum=0;
printf("Enter digits:");
scanf("%d",&n);
int temp=n;
while (a<=n)
{
    digit = n%10;
    sum +=digit;
    n/=10;
}
printf("Digits sum is = %d",sum);


    return 0;
}