
import java.util.Scanner;

class Grade 
{
public static void main(String args[])
{
float num;
Scanner scin=new Scanner(System.in);
System.out.println("Enter the SGPI : ");
num=scin.nextFloat();
if(num>9.5)
{
System.out.println("Grade  O ");
}
else if(num>9 && num<=9.5)
{
System.out.println(" Grade  A+ ");
}
else if(num>8.5 && num<=9)
{
System.out.println(" Grade  A ");
}
else if(num>8 && num<=8.5)
{
System.out.println(" Grade  B ");
}
else if(num>7 && num<=8)
{
System.out.println(" Grade  C ");
}
else if(num<7)
{
System.out.println(" Grade  D ");
}

}
}

