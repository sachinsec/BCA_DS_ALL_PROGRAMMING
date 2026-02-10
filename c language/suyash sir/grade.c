#include <stdio.h>
int main(){

    int j,d,s,m,gd;
    float total,per;
    printf("Enter marks of java.");
    scanf("%d",&j);

    printf("Enter marks of DBMS.");
    scanf("%d",&d);

    printf("Enter marks of Stat.");
    scanf("%d",&s);

    printf("Enter marks of Math.");
    scanf("%d",&m);

    printf("Enter marks of GD.");
    scanf("%d",&gd);

    total = d+s+j+gd+m;
    per = total/5;

    if (90<per)
    {
        printf("A+");
    }
    else if (80<per){
        printf("A");
    }

    else if (70<per){
        printf("B");
    }

    else if (60<per){
        printf("C");
    }

    else if (50<per){
        printf("D");
    }

    else if (40<per){
        printf("E");
    }
    else
    {
        printf("Fail");
    }
    
    
    return 0;
}