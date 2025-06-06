import java.util.*;
class Fibo
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a=0;
int b=1;
System.out.println("enter n");
int n=sc.nextInt();
for(int i=1;i<=n;i++)
{
System.out.println(a);
int temp=a+b;
a=b;
b=temp;
}
}
}

