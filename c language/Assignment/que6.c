#include <stdio.h>
int main(){
int n ;
printf("Enter number");
scanf("%d",&n);
for (int i =1 ; i < n-2; i++)
{
    for (int j = 1; j<=n-i; j++)
    {
        if (j==1||j==n-i)
        {
            printf("*");
        }
        else{
            printf("_");
        }
    }
    printf("\n");
    
}

    return 0;
}