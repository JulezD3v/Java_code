public class Operators{
    public static void main(String[] args) {
    // This question will dispaly a question that relates to all the arithmatic operations in java🦺
    /*
     * You went to the supermarket and bought 12 apples and 5 mangoes:
     *  */

// 12 apples
    var apples = 12;
// 5 mangoes
    var mangoes = 5;
    System.out.println("The number of apples are: " + apples + " and mangoes are: "+ mangoes);
// Write a Java program that uses arithmetic operators to show:
// Total fruits bought (+)
    var total = mangoes + apples; 
    System.out.println("Total number of fruits are: "+ total);
// Difference in number of fruits (-)
    var diff = apples - mangoes;
    System.out.println("Apples are "+ diff + " more than mangoes");
// If you packed them into 5 baskets, how many fruits per basket (/)
    var appleBasket = apples/5;
    var mangoBasket = mangoes/5;
    System.out.println("The number of fruits per 5 askets would be, apples: "+ appleBasket + " and mangoes would be: " + mangoBasket);
// How many fruits would remain unpacked (%)
    var remainder = (apples % 5) + (mangoes % 5);
    System.out.println("Total number of fruits that would remain unpacked would be: " + remainder);
// What happens if the apples double because of a special offer (*)
    var doubleApples = apples * 2;
    System.out.println("If i doubled the apples they would be: " + doubleApples);
// Add one more apple to the basket (++)
    apples++;
    System.out.println("New number of apples is: " + apples);
// Remove one mango because it got spoiled (--)
    mangoes--;
    System.out.println("New number of mangoes is: " + mangoes);
    
    }
}