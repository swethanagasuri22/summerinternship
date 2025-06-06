import java.util.*;
class Reverse
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter string");
String s=sc.next();
StringBuilder str=new StringBuilder(s);
System.out.println("reversed string is:"+str.reverse().toString());
}
}
