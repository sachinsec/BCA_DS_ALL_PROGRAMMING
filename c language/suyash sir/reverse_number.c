//reverse number

#include <stdio.h>
int main(){
int n,digit,a=1,rev=0;
printf("Enter digits : ");
scanf("%d",&n);

int temp = n;
while (a<=n)
{
    digit = n%10;
    rev =rev*10+digit;
    n/=10;
}
printf("Reverse is = %d",rev);

    return 0;
}