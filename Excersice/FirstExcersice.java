import java.util.Scanner;

public class FirstExcersice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter maximum marks of each subject :");
        int total = sc.nextInt();

        System.out.println("Enter your Physics Marks :");
        int physics = sc.nextInt();
        System.out.println("Enter your Chemistry Marks :");
        int chemistry = sc.nextInt();
        System.out.println("Enter your English Marks :");
        int english = sc.nextInt();
        System.out.println("Enter your Math Marks :");
        int math = sc.nextInt();
        System.out.println("Enter your Computer Marks :");
        int computer = sc.nextInt();

        float percentage = ((physics+chemistry+english+math+computer)/(5.0f * total/100));

        System.out.println("percentage : ");
        System.out.println(percentage);

        
        

    }
}
