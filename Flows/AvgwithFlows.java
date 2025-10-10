package Flows;

public class AvgwithFlows {
    public static void main(String[] args) {
        int[] myclass = {20,70,90,60,67,98,90,79,69,90};
        double sum= 0, avg= 0;
        int leng;
        leng = myclass.length;
        for (int num : myclass) {
            sum += num;
        }
        avg = sum/leng;
        avg = Math.floor(avg);
        System.out.println("Averages are: "+ avg);


        // Shows who is allowed into the club according to age
        int ages[] = {20, 16, 18, 35, 25, 26, 17, 23};

        int lowestAge = 21;

        for (int age : ages) {

            if (age < lowestAge) {
                System.out.println("You're " + age+ " years old, by law you're not allowed to drink");
            } 
            else {
                System.out.println("Aaaah " + age+" what can I get you" );
            }
        }
        //Create a program with a list of numbers where you want to skip negative values, but stop completely if you find a zero:
        int[] positive = {3, -1, 7, 0, 9};

        for (int myPose : positive) {
            if (myPose > 0) {
                System.out.println(myPose + " Its positive");
            } else if(myPose < 0) {
                continue;
            }else if(myPose ==0){ break;}
        }

        //Create a program that prints the seat numbers in a theater row, showing both the seat number (the index) and who is sitting there (the value):
    }

} 
