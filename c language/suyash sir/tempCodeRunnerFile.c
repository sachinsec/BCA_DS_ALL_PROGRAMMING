#include <stdio.h>

int main(){
int n;
printf("Enter number\n");
scanf("%d",&n);
for(int i = 0;i<n;i++){

    for (int k = 0; k<i; k++){
     printf("_");
     
    }

    for (int j = 1; j<=n-i; j++){
     printf("*");
    }
    
    printf("\n");
}
    return 0;
}