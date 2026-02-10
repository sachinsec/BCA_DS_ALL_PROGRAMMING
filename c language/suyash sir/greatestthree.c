#include <stdio.h>

int main(){
int a,b,c;
printf("Enter value for a\n");
scanf("%d",&a);

printf("Enter value for b\n");
scanf("%d",&b);

printf("Enter value for c\n");
scanf("%d",&c);
if (a>b && a>c)
{
    printf("Greatest number is = %d",a);
}
else if (b>c)
{
    printf("Greatest number is = %d",b);
}
else
{
    printf("Greatest number is = %d",c);
}




    return 0;
}