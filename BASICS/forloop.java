import java.util.Scanner;
public class forloop {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Start number: ");
        int a = sc.nextInt();
        System.out.println("Enter The End number: ");
        int b = sc.nextInt();
        for(int i=a;i<=b;i++){
            System.out.println(i);
        }
    }
}
