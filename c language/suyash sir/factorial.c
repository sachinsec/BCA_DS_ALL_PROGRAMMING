//Write a program to read a number and display its factorial
#include <stdio.h>
int main(){
long fact=1;
int a;
printf("Enter any number:\n");
scanf("%d",&a);

for (int i = 1; i <=a; i++)
{
    fact *=i;
}
printf("factorial = %ld",fact);
    return 0;
}