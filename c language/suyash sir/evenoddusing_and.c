#include <stdio.h>
int main(){
int a;
printf("Enter number: ");
scanf("%d",&a);
if (a&1==0)
{
    printf("Even");
}
else{
    printf("Odd");
}

    return 0;
}