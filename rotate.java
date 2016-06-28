#include<stdio.h>
void rotate(int arr[],int n,int k)
{
    while(k>0)
    {
     int temp=arr[n-1];
     int i;
        for(i=n-1;i>=0;i--)
        {
        arr[i]=arr[i-1];
        }
        arr[0]=temp;
        k--;
    }
}
int main()
{
    int arr[7]={1,2,3,4,5,6,7};
    rotate(arr,7,3);
    int i;
    for(i=0;i<7;i++)
    {
        printf("\t%d",arr[i]);
    }
    return 0;
}
