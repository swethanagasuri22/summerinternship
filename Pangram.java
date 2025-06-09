import java.util.*;
class Pangram
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter str");
String str=sc.nextLine().toLowerCase();
boolean[] miss=new boolean[26];
for(char ch: str.toCharArray())
{
if(ch>='a' && ch<='z')
{
miss[ch-'a']=true;
}
}
boolean missing=false;
for(int i=0;i<26;i++)
{
if(!miss[i])
{
System.out.println((char)(i+'a')+" ");
missing=true;
}
}
if(!missing)
{
System.out.println("not missing");
}
}
}


