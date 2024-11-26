public class DataTypeDemo {
    public static void main(String[] args) {
        // Working with primitive types
        // Integer number
        byte age = 12;
        short salary = 300;
        int workerId = 9834;
        long population = 1000000000;
        // Floating point number
        float average = 5.4f;
        double biggerAvg = 67.89;
        // boolean -> true | false
        boolean isFemale= true; // false

        // char -> 'a' , 'B' , int , ascii
        char gender='M';
        char unicode = '\u0051'; // Q
        char ascii = 97; // a
        System.out.println("Ascii value is : "+ascii);

        // Wrapper Classes
        Character wCharacter;
        Integer wInteger= 99;
        System.out.println("Value is : "+Integer.toBinaryString(wInteger));

        // int
        int value = -5; // what is the binary of 5
        wInteger = value; // narrowing , widening , casting , autoboxing , unboxing ...
        // 0101 -> 5
        String binaryResult = Integer.toBinaryString(value);

//        Integer.
//        System.out.println(binaryResult.length());

    }
}
