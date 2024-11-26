public class ArithmeticOperators {
    public static void main(String[] args) {
        // + , - , * , /
        int valueA = 3 ;
        int valueB = 2;
        // arithmetic operations
        int sum = valueA + valueB;
        int sub = valueA - valueB;
        int mul = valueA * valueB;
        float div = valueA /(float) valueB; // valueA / valueB  -> 3/2 = 1.5
        int mod = valueA % valueB; // remainder = 0


        System.out.println("Here are the result from above operations: ");
        System.out.println("Sum: "+sum);
        System.out.println("Sub: "+sub);
        System.out.println("Mul: "+mul);
        System.out.println("Div: "+div);
        System.out.println("Mod: "+mod);
    }
}
