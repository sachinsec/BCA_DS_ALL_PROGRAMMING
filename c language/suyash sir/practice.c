#include <stdio.h>
int main(){
int n;
printf("Enter: \n");
scanf("%d",&n);
for(int i = n ; 1 <= i; i--){
    for (int  j = 1; j <=i; j++)
    {
        printf("*");
    }
    for (int j = 1; j <= 2*n-(2*i); j++)  //2*n-2*i
    {
        printf(" ");
    }
    for (int  j = 1; j <=i; j++)
    {
        printf("*");
    }
    
    printf("\n");
}
    return 0;
}