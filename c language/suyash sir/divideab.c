#include <stdio.h>
int main(){
int a,b;
printf("Enter number: ");
scanf("%d",&a);
printf("Enter check number: ");
scanf("%d",&b);
if (a%b==0)
{
   printf("divided from %d",b);
}
else
{
    printf("NOT");
}


    return 0;
}