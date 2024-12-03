package basic;

public class RelationalOperators {
    public static void main(String[] args) {


        // relational ( comparison ) operators
        // ==, > , < , >= , <= , !=
         int valueA=9 , valueB=9;
//         if( valueA > valueB ) = boolean expressions -> return boolean value ( true / false )
        System.out.println(valueA >= valueB);


        // Logical operators
        // AND , OR , NOT

        // scholarship program ( applicable (female student , in year3 )
        char gender = 'm';
        int year =2;

        // 1 AND 1 = 1
        // 1 AND 0 = 0
//        if( gender == 'f' && year == 3 ){
//            System.out.println("Can apply for the scholarship ! ");
//        }else {
//            System.out.println("Cannot apply!!! Check the requirement again ! ");
//        }


        // scholarship ( female , year3 )
        // logical OR
        // 1 OR 0 = 1
        // 0 OR 0 = 0
        if( gender == 'f' || year == 3 ){
            System.out.println("Can apply for the scholarship ! ");
        }else {
            System.out.println("Cannot apply!!! Check the requirement again ! ");
        }

         // gender == 'f' -> !false -> true , !true = false
        // Do you like programming ?   !YES -> NO
        if(!(gender=='f')){
            System.out.println("Gender is male !!");
        }else {
            System.out.println("Gender is female !!");
        }
    }
}
