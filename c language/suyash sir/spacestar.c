#include <stdio.h>
int main(){
int n;
printf("How many stars\n");
scanf("%d",&n);
// space
    for (int i = n; 1 <= i; i--)
    {
        for (int j = 0; j<i; j++)
        {
        printf(" ");
        }

        for (int j = 0; j<8; j++)
        {
        printf("*");
        }
        printf("\n");
    }
    
    //star printing
    

    return 0;
}