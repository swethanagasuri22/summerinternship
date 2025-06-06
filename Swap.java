import java.util.*;
class Swap
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter values");
int a=sc.nextInt();
int b=sc.nextInt();
System.out.println("before swapping:"+a+" "+b);
int temp=a;
a=b;
b=temp;
System.out.println("after swapping:"+a+" "+b);
}
}

