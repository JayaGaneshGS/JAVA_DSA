import java.util.Scanner;
public class array {
    public static void main(String args[]){
        System.out.println("Enter the number of elements you want to store: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0;i<n;i++){
            A[i] = sc.nextInt();
        }
        int B = 0;
        for(int i = 0;i<n;i++){
            B = B+A[i];
    }
    System.out.println("Sum of all the elements of an array: " + B);
  }
}
