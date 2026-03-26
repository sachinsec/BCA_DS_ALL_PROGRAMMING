#include <stdio.h>
int main(){
int n;
printf("Enter value\n");
scanf("%d",&n);

for(int i = n;1<=i;i--){
    printf("*");
    for (int j = 1; j<=i; j++)
    {
       printf("_");
    }
    printf("*\n");
}
    return 0;
}