#include <stdio.h>
int main(){
int a,b;
printf("Enter number: ");
scanf("%d",&a);
printf("Enter check number: ");
scanf("%d",&b);
if (a%10==b)
{
   printf("Last digit of the number is %d",b);
}
else
{
    printf("NOT");
}


    return 0;
}