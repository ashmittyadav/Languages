#include <stdio.h>

int main(){
    int num;
    printf("enter any number");
    scanf("%d",&num);
    printf("factorial of %d is %d",num,fact(num));
    return 0;
} 
int_fact(n){
    if(n==1 || n==0){
        return 1;
    }
    else{
        return n*fact(n-1);
    }
}