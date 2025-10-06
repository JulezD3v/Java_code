public class Variables{
    public static void main(String[] args) {
        String name = "Julie";
        System.out.println(name);
        int num = 20;
        System.out.println(num);
        float grade = 3.899f;
        System.out.println(grade);
        boolean secClassUpper = true;
        System.out.println(secClassUpper);

        //At int the values can change
        int myClass = 7;
        System.out.println(myClass);
        myClass = 13;
        System.out.println(myClass);// its now 13
        
        //Although some ints cannot change like final ints
        //By convention, final variables in Java are usually written in upper case , its not necessary but important for code readability
        final int grandpa = 76;
        System.out.println(grandpa);// if i do try to change it an error will rise

        //Print Variables mostly concatination
        String sis = "Grace";
        System.out.println("Hello there " + sis);
        String fstname = "Jane";
        String lstname = "Doe";
        System.out.println(fstname + lstname +"is here, she also wants to meet you" );

        //Also works in numerics
         int fstnum = 90;
         int lstnum = 120;
         System.out.println("It summed up to: "+ lstnum+fstnum);// this prints out 12090
         System.out.println("Now this really summed up to: "+ (lstnum+fstnum));// this 210

         //Declaring many variables is shorter 
         int x= 9,y= 10,z=1;
         //Call them before assigning them values
         int a,b,c;
         a = b = c = 10;
         System.out.println(x +y+z+a+c+b);// ans should be 50

         //Real Life Examples
         System.out.println("Here some information on a certain highschool student in the 90's ");
         String namez = "Juoanne";
         String gender = "Female";
         String $namez = "Higentoot";
         int agez = 15;
         char _grade = 'B';
         boolean levelUp = true;
         float studentFee = 57.6764f;

         System.out.print("Student name and gender: "+ namez);
         System.out.print(" " + $namez );
         System.out.println("  " +gender );
         System.out.println("Student age: "+ agez );
         System.out.println("Student's grade: "+ _grade );
         System.out.println("Student's leveling up: "+ levelUp );
         System.out.println("Student's payed fee: "+ studentFee );

         //Finding the Area of a triangle

         int leng = 34;
         int height = 15;
         System.out.println("Area of a triangle with sides 34 and height 15: "+ (leng*height* 0.5));
         /*
          * Use float or double?

            The precision of a floating point value indicates how many digits the value can have after
             the decimal point. The precision of float is only 6-7 decimal digits, while double variables 
             have a precision of about 16 digits. 
             
             Therefore it is safer to use double for most calculations.
             they can both be scientific numbers with te ue of "e"
          */
          float f1 = 32e13f;
          double d1 = 43E45d;
          System.out.println(f1 );
          System.out.println(d1);




    }
}