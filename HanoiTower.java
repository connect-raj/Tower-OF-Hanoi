import java.util.*;

public class HanoiTower
{
    public static void toh(int n,char A,char B,char C)//Recursive function for tower of hanoi;
    //here n=no. of disks,A=source tower,B=helper tower & C=destination tower
    {
        if(n==1)//condition to move largest disk to empty tower or Destination tower
        {
            System.out.println("Disk "+n+" moved from "+A+" to "+C);//here we are moving disk from A to C
        }
        else
        {
            toh(n-1,A,C,B);//here C is our helper tower and we are moving disk from A to B
            System.out.println("Disk "+n+" moved from "+A+" to "+C);
            toh(n-1,B,A,C);//here A is our helper tower and we are moving disk from B to C
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Disks:");
        int n=sc.nextInt();
        char A,B,C;
        toh(n,'A','B','C');
    }
}

