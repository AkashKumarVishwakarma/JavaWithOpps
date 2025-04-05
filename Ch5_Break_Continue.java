public class Ch5_Break_Continue {
    public static void main(String[] args) {
        
        // for (int i = 0; i < 5; i++) {
        //     System.out.println(i);
        //     System.out.println("java is great");
        //     if(i==2){
        //         System.out.println("Ending the loop..");
        //         break;
        //     }
            
        // }
        // System.out.println("Loops ends here..");



        for (int i = 0; i < 5; i++) {
            if(i==2){
                // System.out.println("Ending the loop..");
                continue;
            }
            System.out.println(i);
            System.out.println("java is great");
        }
        System.out.println("Loops ends here..");



    }
}
