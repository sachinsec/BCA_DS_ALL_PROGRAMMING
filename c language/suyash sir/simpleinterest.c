#include <stdio.h>
int main(){
  printf("Amount: ");
  int p,r,t;
  scanf("%d",&p);

  printf("Rate: ");
  scanf("%d",&r);

  printf("Time: ");
  scanf("%d",&t);

  printf("Simple interest is = %d",(p*r*t)/100);

    return 0;
}