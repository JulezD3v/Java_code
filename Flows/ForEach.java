package Flows;


public class ForEach {
    public static void main(String[] args){
    // the syntax is for(type Variable: arrayName){ code block}
    int[] numbers = {1,3,4,5,6};
    for(int num : numbers){
       System.out.println(num);
    }

    String[] cars ={"Volvo", "Toyota", "Lexsus"};
    for(String car : cars){
        System.out.println(car + " is mine");
    }
    }
}
