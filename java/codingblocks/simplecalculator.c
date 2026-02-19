#include <stdio.h>
int main(){
int n1,n2,sum=0,sub=0,mu=0,div=0,mo=0;
char ch;
do{
    scanf("%c",&ch);
 if (ch=='+')
 {
    scanf("%d",&n1);
    printf("\n");
    scanf("%d",&n2);
    sum=n1+n2;
 }
 else if (ch=='-')
 {
     scanf("%d",&n1);
    printf("\n");
    scanf("%d",&n2);
    sub=n1-n2;
 }
 else if (ch=='*')
 {
     scanf("%d",&n1);
    printf("\n");
    scanf("%d",&n2);
    mu=n1*n2;
 }
 else if (ch=='/')
 {
     scanf("%d",&n1);
    printf("\n");
    scanf("%d",&n2);
    div=n1/n2;
 }
 else if (ch=='%')
 {
     scanf("%d",&n1);
    printf("\n");
    scanf("%d",&n2);
    mo=n1%n2;
 }
 else
 {
    printf("Invalid");
 }
 
 
}while (ch=='+'||ch=='*'||ch=='/'||ch=='-'||ch=='%');
   printf(sum);

    return 0;
}