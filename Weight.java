public class Weight {
    public static void main(String[] args) {
//  A fitness app calculates your Body Mass Index (BMI) using the formula:

// (weight in kilograms, height in meters).The program should:
String name = "Julie";
double weightKg = 65.5;
double height = 1.63; 

// Calculate their BMI.
double bodyMassIndex = weightKg / Math.pow(height,2);
System.out.println("You must be " + name + "hope you're having a greate day. Here are the results");
// If BMI < 18.5 → “Underweight”
 if (bodyMassIndex <= 18.5){
    System.out.println("Seems your underweight, no worries I'll help you fix that ");
 } // If BMI between 18.5 and 24.9 → “Normal”
 else if(bodyMassIndex > 18.5 && bodyMassIndex <= 24.9 ){
    System.out.println("Great news you have a healthy BMI");
 }
// If BMI between 25 and 29.9 → “Overweight”
else if(bodyMassIndex >25 && bodyMassIndex <= 29.9){
    System.out.println("Hey there seems like you're overweight, well don't worry we'll fix that");
} // Else → “Obese”
else{
    System.out.println("Ooh My, seems like like your obese, well dont worry well fix that, I'll be here with through every step of your journey");
}


    }
}
