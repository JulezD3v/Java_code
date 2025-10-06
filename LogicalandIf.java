public class LogicalandIf {
    public static void main(String[] args) {
        //This example shows how you can use if..else to "open a door" if the user enters the correct code:

        int code = 1337;
        if (code == 1337){
            System.out.println("Access granted");
        }else{
            System.out.println("Access denied, try again");
        }
        //Login pages
        String emailString = "JohnDoe@outlook.com";
        String password = "BUILDER";

        String accessGranted =(emailString =="JaneDoe@outlook.com" && password == "BUILDER") ? "Access granted, welcome back" : "Either your password or email address is wrong";
        System.out.println(accessGranted);
    }
}
