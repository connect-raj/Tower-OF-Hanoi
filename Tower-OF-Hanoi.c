#include<stdio.h>
#include<conio.h>

void toh(int n,char A,char B,char C)//Recursive function for tower of hanoi;
//here n=no. of disks,A=source tower,B=helper tower & C=destination tower
{
    if(n==1)//condition to move largest disk to empty tower or Destination tower
    {
        printf("\nDisk %d moved from %c to %c",n,A,C);//here we are moving disk from A to C
    }
    else
    {
        toh(n-1,A,C,B);//here C is our helper tower and we are moving disk from A to B
        printf("\nDisk %d moved from %c to %c",n,A,C);
        toh(n-1,B,A,C);//here A is our helper tower and we are moving disk from B to C
    }
}
void main()
{
    int n;//number of disks
    char A,B,C;//towers
    printf("Enter the Number of Disks:");
    scanf("%d",&n);
    toh(n,'A','B','C');//first recursive call
}
