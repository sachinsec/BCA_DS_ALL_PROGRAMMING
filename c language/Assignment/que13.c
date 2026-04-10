#include <stdio.h>

int main(){
int n;
printf("Enter the value\n");
scanf("%d",&n);
for (int i = n; 1 <= i; i--)
{
    for (int j = 1; j<=i;j++)
    {
        printf("%d",j);
    }
    printf("\n");
    
}


    return 0;
}