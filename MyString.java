public class MyString{
    public static void main(String[] args) {
        //Strings in java are concedered as objects and some of there method are:-

        String txt = "The quick brown fox jumped over the lazy dog";
        String txt2= "Peter potter pottered a pot";
        String txt3 = "The quick brown fox jumped over the lazy dog";
        System.out.println(txt.toUpperCase());
        System.out.println(txt.toLowerCase());
        System.out.println("The length of the text is: "+ txt.length()); //length of the word
        System.out.println(txt.indexOf("jumped")); //finding the index of the word
        System.out.println(txt.charAt(12));//finding a char
        System.out.println(txt.equals(txt2));
        System.out.println(txt.equals(txt3));

    }
}