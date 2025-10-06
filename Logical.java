public class Logical {

    public static void main(String[] args) {
//Here’s a real-life style practice problem mixing math + strings + logical operators:

// 👉 An online shop gives a special deal:
      int customerSpend = 1000;
      boolean membStatus =true;
      boolean birthday = true;
// If a customer spends more than 1000 AND is a “member”, they get 20% off.
    if (customerSpend > 1000 && membStatus){
        double customerBalance = customerSpend- (customerSpend * 0.2);
        System.out.println("Congrats you get a 20% discount, your new balance is Ksh"+ customerBalance + ". We appreciate you for being a loyal customer ");
    }
    else{
        System.out.println("Sorry you did not qualify for the bonus");
    }
    if(customerSpend > 500 || birthday){
            System.out.println("Its either there birthday or they have spent more than Ksh500");   
        }
     
            boolean isLoggedIn = true;
    boolean isAdmin = false;
    int securityLevel = 3; // 1 = highest

    if (isLoggedIn && (isAdmin || securityLevel ==3)) { //Try playing security levels to 
        System.out.println("Access granted");
    } else {
        System.out.println("Access denied");
    }
    }
    
    // Moved these variables and logic inside main method

 }
 
