package arraylesson;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // value must a number ,
        // value must be positive number
        int value = 0;
        while(true){
            System.out.println("Enter the value (number only) : ");
            value = scanner.nextInt();
            if(value<=0){
                System.out.println("Value must be > 0 ");
            } else{
                break;
            }
        }


        System.out.println("This is the value: "+value);

        // Enter only number ( not string )
        String numberStr ="";
        while(true){
            try{
                System.out.println("Enter the value (number only) : ");
                numberStr = scanner.nextLine();
                int number = Integer.parseInt(numberStr);
                System.out.println("This is the number : "+number);
                break;
//                return number;
            }catch (NumberFormatException ex ){
                System.out.println("Value must be number!! ");
            }

        }


    }
}
