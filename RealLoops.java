public class RealLoops {
    public static void main(String[] args) {
        int dice  = 1;
        while (dice <= 6) {
            if (dice < 6) {
                System.out.println("Yanky");
                
            }else{
                System.out.println("Congrats, not yanky, you are a " + dice);
            }
            dice++;
        }
    }
}
