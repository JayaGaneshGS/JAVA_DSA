import java.util.Scanner;
public class ternaryoperator {
    public static void main(String args[]){
        System.out.println("Enter a Number A: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter a Number B: ");
        int b = sc.nextInt();
        int c = (a>b)?a:b;
        System.out.println("The greater number is: "+c);
    }
}
