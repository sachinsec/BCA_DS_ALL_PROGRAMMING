#include <stdio.h>
int main(){
int am;
printf("Enter amount: ");
scanf("%d",&am);
if (am>10000)
{
     float dis=(am*10)/100;   
    printf("bill prize = %f ",am-dis);
}
else
{
    float dis=(am*5)/100;   
    printf("bill prize = %f ",am-dis);
}


    return 0;
}