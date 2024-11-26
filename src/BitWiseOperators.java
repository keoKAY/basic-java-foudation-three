public class BitWiseOperators {
    public static void main(String[] args) {
        // Bitwise , & , | , ~ ,  ^, >> , << , >>> ( unsigned right shift )

        int valueA= 5;
        int valueB= 6;
        int valueC = -1;
//        int result = valueA&valueB;
//        int result = valueA|valueB;
        int result = valueA ^ valueB;
        System.out.println("Binary of value A : "+valueA+"="+Integer
                .toBinaryString(valueA));
        System.out.println("Binary of value B : "+valueB+"="+Integer
                .toBinaryString(valueB));
        System.out.println("Binary of value result : "+result+"="+Integer
                .toBinaryString(result));


        // 1+1 = 2 , 5+5 = 10

        // binary= 1, 0 : 1 + 0 = 1 , 1+1 = 10


        // Working shifting
        // 0001
        valueC = valueC<<2; // 0100
        valueC = valueC>>1;  // 0010
        System.out.println("Binary of value C : "+valueC+"="+Integer
                .toBinaryString(valueC));
        int valueD = -2;
        valueD = ~valueD;
        System.out.println("Binary of value D : "+valueD+"="+Integer
                .toBinaryString(valueD));

        int valueE = -5;
        valueE = valueE >> 2;
        System.out.println("Binary of value E : "+valueE+"="+Integer
                .toBinaryString(valueE));
    }
}
