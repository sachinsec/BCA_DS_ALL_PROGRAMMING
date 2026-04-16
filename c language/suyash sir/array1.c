// Read an elements and print them
#include <stdio.h>
int main(){
int size;
printf("Enter size: ");
scanf("%d", &size);
int n[size];
for (int i = 0; i < size; i++)
{
    printf("Enter value no %d.",i+1);
    scanf("%d",&n[i]);
}
for (int i = 0; i < size; i++)
{
    printf("%d\n",n[i]);
}


   return 0;
}