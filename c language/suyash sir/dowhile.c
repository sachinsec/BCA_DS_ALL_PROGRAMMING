#include <stdio.h>
int main(){
    int a;
printf("Enter number: ");
scanf("%d",&a);
do
{
    if (a&1==0)
    {
        printf("Even");
    }
    else{
        printf("Odd");
    }
    
} while (a>=1);


    return 0;
}