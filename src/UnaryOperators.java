public class UnaryOperators {
    public static void main(String[] args) {
        // unary -> only one operand to perform operations
        // ++ , --
        int valueA=10;
        int valueB=0;


        // assignment order
//        int result = --valueA;
        int result = valueA--;
        System.out.println("Result is : "+result); // 10
        System.out.println("Value A is : "+valueA); // 9
        // two operands
    }
}
