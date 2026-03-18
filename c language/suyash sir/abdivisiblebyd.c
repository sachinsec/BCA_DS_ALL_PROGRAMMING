// Program to printf numbers between a and b divisible by c
#include <stdio.h>
int main(){
int a,b,c;
printf("Enter value of a: ");
scanf("%d",&a);

printf("Enter value of b: ");
scanf("%d",&b);

printf("Enter value of c: ");
scanf("%d",&c);

for (a; a <=b ; a++)
{
    if (a%c==0)
    {
        printf("%d\n",a);
    }
    
}


return 0;
}