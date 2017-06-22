#include<stdio.h>
int main()
{

    int n,i,s;
    scanf("%d",&n);
    for(i=1;i<=n;i++)
    {
        s=i*n;
        printf("%d*%d=%d\n",i,n,s);

    }
}
