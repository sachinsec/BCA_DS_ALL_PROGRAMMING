#include <stdio.h>
int main(){
int a;
printf("Enter N number : ");
scanf("%d",&a);
printf(".....Counting....\n");
for (int i = a; i >= 1; i--)
{
    printf("%d\n",i);
}

    return 0;
}