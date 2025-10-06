public class Mymath {
    public static void main(String[] args) {
      //Used to find the highest value of x  and y
      Math.max(5, 10);
      //Finds the lowest value of x and y
      Math.min(5,12);
      Math.sqrt(625);//square root
      Math.pow(3,4); //3^4
      Math.abs(-56.9); // turns a num to an absolute positive
      Math.round(4.6);  // 5
      Math.ceil(4.1);   // 5.0
      Math.floor(4.9);  // 4.0
      Math.random();//returns a random number btw 0.0 to 1.0

      double newNum = 100* Math.random();
      System.out.println(newNum);

    }
}
