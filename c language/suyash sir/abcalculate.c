// Program to read a and b calculate a^b

#include <stdio.h>
int main(){
int a,b,power=1;
printf("Enter value of a : ");
scanf("%d",&a);
printf("Enter value of b : ");
scanf ("%d",&b);
for (int i = 1; i <= b; i++)
{
    power *= a;
}
printf("%d",power);
    return 0;
}