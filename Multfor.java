public class Multfor {
    public static void main(String[] args) {
        for(int i = 2; i ==2; i++){
            
            for(int j = 1; j <= 10; j++){
                
                System.out.println(i * j );
            }
            System.out.println();
        }// Doesnt show the 2* 2 just the answers
      System.out.println( );

        for(int n = 3; n == 3; n++){
            for(int m = 1; m <= 10; m++){
                System.out.println(n +" * " + m +" = "+ m*n); // This one works, just 3
            }
        }
         for(int a = 1; a <= 5; a++){
            for(int x = 1; x <= 10; x++){
                System.out.println(a +" * " + x +" = "+ a*x); // This one works 1-5
            }
            System.out.println();
        }
    }
}
