public class Ch6_PracticeSet {
    public static void main(String[] args) {
        //Problem 1
        // float [] arr = {4.4f, 5.4f, 67.6f, 99.2f, 100};
        // // System.out.println(arr.length);

        // float sum = 0;
        // for (float f : arr) {
        //     sum += f;
        // }
        // System.out.println("The value of sum is : "+sum);


        //Problem 2

        // float [] arr = {4.4f, 5.4f, 67.6f, 99.2f, 100};
        // // float num = 45.7f;
        // float num = 5.4f;
        // boolean isInArray = false;

        // for (float f : arr) {
        //     if (num == f) {
        //         isInArray = true;
        //         break;
        //     }
        // }
        // if (isInArray) {
        //     System.out.println("The value is  present in the Array..");
        // }else{
        //     System.out.println("The value is not present in Array");
        // }


        //Problem 3

        // float [] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
        // float sum = 0;
        // for(float element:marks){
        //     sum = sum + element;
        // }
        // System.out.println("The value of average marks is " + sum /marks.length);


        //Problem 4

        // int [][] mat1 = {{1, 2, 3},
        //                  {4, 5, 6}};

        // int [][] mat2 = {{2, 6, 13},
        //                  {3, 7, 1}};

        // int [][] result = {{0, 0, 0, },{0, 0, 0}};

        // for(int i= 0; i<mat1.length;i++){
        //     for (int j = 0; j<mat1[i].length; j++) {
        //         // System.out.format("Setting value for i=%d and j=%d\n", i,j);
        //         result[i][j] = mat1[i][j] + mat2[i][j];
        //     }
        // }

        // //Printing the element of a 2D array
        // for(int i= 0; i<mat1.length;i++){
        //     for (int j = 0; j<mat1[i].length; j++) {
        //         System.out.print(result[i][j] + " ");
        //     }
        //     System.out.println();
        // }



        //Problem 5
        // int [] arr = {1,  2, 3, 4, 5, 0};
        // int l = arr.length;
        // int n = Math.floorDiv(l, 2);
        // int temp;

        // for (int i = 0; i < n; i++) {
        //     //Swap a[i] and a[l-i-1]
        //     temp = arr[i];
        //     arr[i]=arr[l-i-1];
        //     arr[l-i-1]=temp;

        // }
        // for (int element : arr) {
        //     System.out.print(element+ " ");
        // }



        //Problem 6

        // int [] arr = {1, 21, 3, 455, 5, 34, 67};
        // int max = 0;
        // for (int element : arr) {
        //     if(element>max){
        //         max = element;
        //     }
        // }
        // System.out.println("The value of the maximum element in this array is : "+ max);


        //Problem 7

        // int [] arr = {1, 21, 3, 455, 5, 34, 67, 0};
        // int min = arr[0];
        // for (int element : arr) {
        //     if(element<min){
        //         min = element;
        //     }
        // }
        // System.out.println("The value of the min element in this array is : "+ min);

        // ===============================================================================================


        // System.out.println(Integer.MIN_VALUE);
        // System.out.println(Integer.MAX_VALUE);

        // int [] arr = {1, -2100, -3, 465, 5, 34, 67};
        // int min = Integer.MAX_VALUE;
        // for (int i : arr) {
        //     if(i<min){
        //         min = i;
        //     }
        // }
        // System.out.println("The value of the minimum in this array is :"+ min);


        //Problem 8

        boolean isSorted = true;
        int [] arr ={1, 2, 3, 41, 5, 6, 67};
        for (int i = 0; i < arr.length-1; i++) {
            // arr[i]<arr[i+1];
            if(arr[i]>arr[i+1]){
                isSorted = false;
                break;
            }
        }
        if (isSorted) {
            System.out.println("Sorted..");
        }else{
            System.out.println("UnSorted Array..");
        }
        


    }
}
