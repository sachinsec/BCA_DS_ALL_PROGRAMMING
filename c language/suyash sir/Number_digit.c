#include <stdio.h>
int main(){
int n,digit,d,count=0;
printf("Enter number: ");
scanf("%d",&n);

printf("Enter digit ");
scanf("%d",&digit);

int b=n;
while (b>=1)
{
    d=b%10;
    if (d==digit)
    {
        count++;
    }
    
    b/=10;
}
printf("%d",count);

    return 0;
}