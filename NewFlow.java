public class NewFlow {
    public static void main(String[] args) {
        //While loop, they don't run when the condition is wrong
        int num = 0;
        while (num < 5) {
            System.out.println("Testing, Hello World " + num);
            num++;
        }

        int countDown = 5;
        while (countDown > 0) {
            System.out.println("From " + countDown);
            countDown--;
        }
        System.out.println("Happy New Year Bitches");

        // Let add a do to the while, code will still run even if the condition is wrong

        int death = 5;
        do{
            System.out.println("Death is coming to you at " + death);
            death--;
        }
            while (death > 0);
        
        
    }
}
