package Flows;
import java.util.Random;
public class FuelStation {
    public static void main(String[] args) {
        Random rand = new Random();
        for(int pump = 1; pump <= 3; pump++){
            System.out.println("Fuel pump: "+ pump);
            int totalFuel = 0;
            for(int car= 1; car <= 5; car++){
                int fuelAmount = rand.nextInt(46)+5;
                totalFuel += fuelAmount;
                
                if(fuelAmount < 20){
                    System.out.println(fuelAmount+ ": Car needs a large refill");
                }
                else if(fuelAmount >= 20 && fuelAmount < 40){
                    System.out.println(fuelAmount+ ": Car needs a medium refill");
                }
                else{
                    System.out.println(fuelAmount+": Car needs a small refill");
                }
            }
             System.out.println("Total fuel dispensed at Pump " + pump + ": " + totalFuel + " liters\n");
        }
        
    }
}
// 🚗 Question: "Fuel Station Simulation"
// Write a Java program that simulates cars fueling at different pumps in a fuel station.
// Requirements:
// There are 3 fuel pumps.
// Each pump serves 5 cars.
// Use nested for loops to represent each pump and each car.
// For every car:
// Generate a random fuel amount between 5 and 50 liters.
// If the fuel amount is below 20, print: "Car needs a small refill".
// If it’s 20 to 40, print: "Car needs a medium refill".
// Otherwise, print: "Car needs a full refill".
// Display total fuel dispensed per pump at the end.