package chapter3;

public class StringLesson {

    public static void main(String[] args) {
        String name = "Fluffy";
        String a = "1";
        a="0";
        a+="2";
        a+="3";
        String b ="1";
        String name2 = "Fluffy";
        name = null;
        name2 = null;
        String name3 = new String("Fluffy");
        System.out.println(a);

        String word1 ="Stand alone";
        System.out.println(word1.toUpperCase());
        word1 = word1.toUpperCase();
        System.out.println(word1.toLowerCase());
        System.out.println(word1);
        String trimSample = "       \t \n \t      NJ Crux    \t    \n";
        System.out.println(trimSample.trim());  

        
    }

}
