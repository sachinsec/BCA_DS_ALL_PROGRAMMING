// Program to print numbers between 100 and 200 divisible by 3

#include <stdio.h>
int main(){
for ( int i = 100; i <= 200; i++)
{
    if(i%3==0){
        printf("%d\n",i);
    }
}
    return 0;
}