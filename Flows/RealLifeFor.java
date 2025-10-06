package Flows;
public class RealLifeFor {
    public static void main(String[] args) {
// You’re managing a parking lot that has 3 floors, and each floor has 10 parking spots.
// Write a Java program using nested for loops to display which spots are available and which are occupied.
// Assume:
// Spots with even numbers are occupied.

   for(int floor = 1; floor <=3; floor++){
    System.out.println("Floor: " + floor);
        for(int spot = 1; spot <= 10; spot++){
            if (spot % 2 == 0){
                System.out.println("Spot "+ spot+": Occupied");   
            }
            else{
                System.out.println("Spot " +spot+ ": Available");
            }

        }
        System.out.println();

    }

 
    }
}
