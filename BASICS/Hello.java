import java.lang.System;
import java.util.Scanner;
class Hello{
   public static void main(String args[])
   {
    System.out.println("Hello World");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number a: ");
    int a = sc.nextInt();
    System.out.println("Enter a number b: ");
    int b = sc.nextInt();

    int c = a+b;
    System.out.println("Sum of a and b is: "+c);

    sc.nextLine();

    String s = sc.nextLine();
    System.out.println("Entered String is: "+s);
   }
}