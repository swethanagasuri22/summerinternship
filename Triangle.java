import java.util.*;
class Triangle
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter values");
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
int h=sc.nextInt();
double area=0.5*b*h;
int per=a+b+c;
System.out.println("area is "+area+ "and perimeter is "+per);
}
}