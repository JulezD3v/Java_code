package Flows;

public class ForArray {

    public static void main(String[] args) {
        String[] threads ={"Two-Ply","Fishing","Jeans","Yarn"};
        for(int i = 0; i < threads.length; i++){

            System.out.println(threads[i]+ " thread is sold out");

        }

        int[] numbers = {1,4,6,12,45,6};
        int sum;

        for(int i= 0; i< numbers.length; i++){
             sum = numbers[i] * 2;
             System.out.println(sum);
        }
    }
}