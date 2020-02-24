public class Stringmeth
{
public static void main(String args[])
{
String s1= new String("computer");
int i=s1.indexOf('m');
System.out.println("index is"+i);
String s2= new String("Computer");
if(s1.equals(s2))   // this function is not case senstive
System.out.println("strings are same");
else 
System.out.println("Strings are not same");
 

}
}

