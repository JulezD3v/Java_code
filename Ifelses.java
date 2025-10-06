public class Ifelses {
    public static void main(String[] args) {
        //nb if you're firmiliar with dart java is a walk in the park
        boolean lightOn = false;
        if(!lightOn){ // anything inside the brackets are considered true
            System.out.println("The lights are off");
            // another form of if... else ...variable = (condition) ? expressionTrue :  expressionFalse;

            int age = 20;
            String votingAge = (age > 18 )? "Great news, you can vote": "Sorry lad you\'re too young to vote"; 
            System.out.println(votingAge);
        }

    }
}
