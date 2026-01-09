import java.util.Scanner;
public class Function_parameter {
    String passorfail(int marks){
        if(marks >= 35){
            return "Pass";
        }else{
            return "Fail";
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks: ");
        int marks = sc.nextInt();
        Function_parameter student = new Function_parameter();
        String result = student.passorfail(marks);
        System.out.println(result);
    }

}
