public class NewForLoops {
    public static void main(String[] args) {
       // for (statement 1; statement 2; statement 3) {
  // code block to be executed}... and this is its for..lop sysntax
  //Stat 1 = state before condition Stat2 = Condition to run Stat3 = ias executed everytime the code block is executed

  //More like a shorter version of the while loop
  for(int num = 5; num >= 0; num--){
      System.out.println("Coutdown: " + num);
  }

  //Evean numbers
  for(int multTwo = 0; multTwo <=10; multTwo= multTwo +2){
    System.out.println("Answer is: " + multTwo);
  }
  //Sum of numbers
  int sum = 0;
  for(int i = 1; i <= 5; i++){
    sum = sum + i;
    System.out.println("Sum is: " + sum);
  }

  //Onwards with Nested loops 
  // Outer loop
for (int i = 1; i <= 2; i++) {
  System.out.println("Outer: " + i); // Executes 2 times
  
  // Inner loop
  for (int j = 1; j <= 3; j++) {
    System.out.println(" Inner: " + j); // Executes 6 times (2 * 3)
  }
}
// Multiplication Table of 1,2 and 3 till 3
for(int i = 1; i <= 3; i++){
     for(int n = 1; n <= 3; n++){
        System.out.print(i * n + " ");
     }
System.out.println();
}
    }
}
