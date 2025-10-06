public class Mymathassg {
    
public static void main(String[] args) {
    /*👉 A school wants to randomly select one student from a class of 40 students to answer a question. 
    Write a program that uses Java’s Math.random() to generate a student roll number between 1 and 40. 
    Then, display a message like: “Student 17, please answer the question.” */

    int total = 40;
    double student = total * Math.random();
    double chosen = Math.floor(student);
    System.out.println("Student " + chosen+", please answer the question");
}
}
