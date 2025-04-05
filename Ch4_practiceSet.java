import java.util.Scanner;

public class Ch4_practiceSet {
    public static void main(String[] args) {
        //Problem 1
        // int a = 10;
        // if(a=11){
        //     System.out.println("I am 11");
        // }
        // else{
        //     System.out.println("I am not 11");
        // }

        //Problem 2
        // byte m1, m2, m3;
        // Scanner sc = new Scanner(System.in);

        // System.out.println("Enter your marks in Physics");
        // m1 = sc.nextByte();

        // System.out.println("Enter your marks in Chemistry");
        // m2 = sc.nextByte();

        // System.out.println("Enter your marks in Mathematics");
        // m3 = sc.nextByte();

        // float avg = (m1+m2+m3)/3.0f;
        // System.out.println("Your Overall percentage is : " + avg);

        // if(avg>=40 && m1>=33 && m2>=33 && m3>=33){
        //     System.out.println("Congratulation, You have been promoted.");
        // }else{
        //     System.out.println("Sorry, You have not been promoted! Please try again.");
        // }


        //Problem 3

        // Scanner sc = new Scanner(System.in);
        // float tax = 0;
        // System.out.println("Enter Your Income in Lakhs per annum :");
        // float income = sc.nextFloat();
        // if (income<2.5) {
        //     tax = tax+0;
        // }
        // else if(income>2.5f && income<=5f){
        //     tax = tax + 0.05f * (income - 2.5f);
        // }
        // else if(income>5f && income<=10.0f){
        //     tax = tax + 0.05f * (5f - 2.5f);
        //     tax = tax + 0.2f * (income - 5f);
        // }
        // else if(income>10f){
        //     tax = tax + 0.05f * (5f - 2.5f);
        //     tax = tax + 0.2f * (10.0f - 5f);
        //     tax = tax + 0.3f * (income - 10f);
        // }

        // System.out.println("The total tax paid by the employee :" + tax);


        //Problem 4

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter number :");
        // int day = sc.nextInt();

        // switch (day) {
        //     case 1 -> System.out.println("Monday");
        //     case 2 -> System.out.println("Tuesday");
        //     case 3->System.out.println("Wednesday");
        //     case 4->System.out.println("Thursday");
        //     case 5->System.out.println("Friday");
        //     case 6->System.out.println("Saturday");
        //     case 7->System.out.println("Sunday");
        //     default->System.out.println("Invalid Input");
        // }


        //Problem 5

        // Scanner sc = new Scanner(System.in);
        // int year = sc.nextInt();

        // if(((year%4 == 0) && (year%100 != 0)) || (year%400 == 0)){
        //     System.out.println("Leep Year!");
        // }else{
        //     System.out.println("Not Leep Year");
        // }


        //Problem 6

        // Scanner sc = new Scanner(System.in);
        // String website = sc.next();
        // // website = website.trim();
        // if(website.endsWith(".org")){
        //     System.out.println("This is an organizational website");
        // }else if(website.endsWith(".com")){
        //     System.out.println("This is Commercial website");
        // }else if(website.endsWith(".in")){
        //     System.out.println("This is Indian website");
        // }

    }
}
