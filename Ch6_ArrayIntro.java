public class Ch6_ArrayIntro {
    public static void main(String[] args) {
        
        //Classroom of 500 students - You have to store marks of these 500 students
        /*
        You have 2 option
        1. Create 500 variables
        2. Use Array (recommended)
        */

        //[dataType [] ArrName;]

        // int [] marks = new int[5];  // Declaration + memory Allocation

        // marks[0] = 100;
        // marks[1] = 70;
        // marks[2] = 60;
        // marks[3] = 75;
        // marks[4] = 86;

        // // marks[5] = 96; //Throw Error because size are alrady declared 5 which means 0-4

        // // marks[4] = 96; // OverWritting

        // System.out.println(marks[4]);
        // // System.out.println(marks[5]);



        // int [] marks;  // Declaration
        // marks = new int[5];  // Memory Allocation


        int [] marks = {100, 70, 80, 71, 98};  // Declaration + Memory Allocation + Initialization
        
        System.out.println(marks[4]);
        System.out.println(marks[1]);


    }
}
