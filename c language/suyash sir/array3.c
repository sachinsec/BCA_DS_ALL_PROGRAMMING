// Q2 Wap to count even and odd numbers
#include <stdio.h>
int main(){
     int size;
    printf("Enter array size: ");
    scanf("%d",&size);
int n[size];
int count=0,odcount=0;
for (int i = 0; i < size; i++){
printf("Enter value");
scanf("%d",&n[i]);
  if (n[i]%2==0)
  {
    count++;
  }
  else{
      odcount++;
  }
  
}
printf("Even = %d\n",count);
printf("Odd = %d\n",odcount);
    return 0;
}