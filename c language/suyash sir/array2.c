// Wap to calculate sum of all elements in array.

#include <stdio.h>
int main(){
    int size;
    printf("Enter array size: ");
    scanf("%d",&size);
int a[size];
int sum=0;

for(int i =0 ;i<size;i++){
    printf("Enter number value: ");
    scanf("%d",&a[i]);

    sum+=a[i];
}
printf("%d",sum);
    return 0;
}