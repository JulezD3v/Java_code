public class AssinOps {
    public static void main(String[] args) {
        // The question will cover some of the Assignment Operators in Java 
//You start the day with Ksh 1000 in your wallet. Use assignment operators to simulate these real-life actions:
      var currentBalance = 1000;
      System.out.println("Began with Ksh"+ currentBalance);
// += You get a payment of Ksh 500.
      currentBalance += 500;
      System.out.println("After daily payment: Ksh" + currentBalance);
// -= You buy groceries worth Ksh 200.
       currentBalance -= 200;
       System.out.println("After buying groceries: Ksh" + currentBalance);

// *= You invest and your money doubles.
       currentBalance *= 2;
       System.out.println("After investment: Ksh" + currentBalance);

// /= You share the money equally with 4 friends.
       currentBalance *= 0.5;
       currentBalance /= 4;
       System.out.println("Amount each friend gets after giving them 50%: Ksh"+ currentBalance);

// %= After that, you divide the remaining money among 3 people and keep the remainder.
     currentBalance *= 4;
     currentBalance %= 3;
     System.out.println("After left: Ksh" + currentBalance);

    }
}
