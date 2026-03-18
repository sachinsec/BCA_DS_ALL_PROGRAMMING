//Print all perfect squares between 1 and 1000
#include <stdio.h>
int main(){
int d,i,count=0;
printf("Enter starting number: ");
scanf("%d",&i);
printf("Enter Ending number: ");
scanf("%d",&d);
for (i; i <= d; i++)
{
    if(i*i>d){
     break;
    }
    printf("%d\n",i*i);
    count++;

}
printf("Last square number is = %d",count);

    return 0;
}