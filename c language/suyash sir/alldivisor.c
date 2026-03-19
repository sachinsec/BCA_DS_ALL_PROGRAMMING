//Print all divisors of a number.

#include <stdio.h>
int main(){
int a;
printf("Enter number: ");
scanf("%d",&a);
for (int i = 1; i <= a; i++)
{
    if(a%i==0){
        printf("Divisors of %d is = %d\n",a,i);
    }
}


    return 0;
}