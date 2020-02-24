public class Stringmeth2
{
public static void main(String arg[])
{
String s1= new String("Computer");
String s2= new String("computer");
int i=s1.compareTo(s2); // compares unicode of different character
if(i==0)
System.out.println("Strings are same");
else if(i>0)
System.out.println("Strings are not in dictionary order");
else
System.out.println("Stings are in dictionary order");
}
}
 
