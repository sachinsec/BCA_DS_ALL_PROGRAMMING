// write a program to reverse each elements of array.
#include <stdio.h>
int main(){
int size,d;
printf("Enter size of array: ");
scanf("%d",&size);
int a[size];

for (int i = 0; i < size; i++)
{
   printf("Enter value: ");
   scanf("%d",&a[i]);
}
printf("Reverse printing: \n");
for (int i = size-1; 0 <= i; i--)
{
 //   printf("%d",i);
   printf("%d\n",a[i]);
}
    return 0;
}