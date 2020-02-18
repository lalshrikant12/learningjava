import java.util.Scanner; 

public class Try
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int a,b;
int div;
a=sc.nextInt();
b=sc.nextInt();
try
{
div=a/b;
System.out.println(+div);
}
catch(Exception e)
{
if(b==0)
System.out.println("wtf");
}
System.out.println("Hello");
}
}
