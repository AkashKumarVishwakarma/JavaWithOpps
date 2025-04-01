public class Ch2_Op_precedence {
    public static void main(String[] args) {

        //Precedence  & Associativty
        // int a = 6*5-34/2;
        /*
        Highest presedence goes to * and /. They are then evaluated on the basis of left to right associativity
          = 30-34/2
          = 30-17
          = 13
         */
        // int b = 60/5-34*2;
        /*
         * = 12-34*2
         * = 12-68
         * = -56
         */

        // System.out.println(a);
        // System.out.println(b);

        // a=b=45; //Associativity Righr to Left

        // Quick Quie
        /*
            int x=6;
            int y=1;

            int k = x*y/2;
            System.out.println(k);
         */

         int a=5;
         int b=1;
         int c=4;

         int k = b*b - (4*a*c)/(2*a);

         System.out.println(k);
    }
}
