import java.util.Scanner;

public class InputDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // declare variabels
        String name;
        String gender;
        int age;

        // garbage value
//        System.out.println("age is : "+ age );
        System.out.println("Enter your name: ");
        name = input.nextLine();
        System.out.println("Enter your gender : ");
        gender = input.nextLine();
        System.out.println("Enter your age : ");
        age = input.nextInt();
        input.nextLine().charAt(0); // get only the first chracter !
        System.out.println("******<<Person information >> ******");
        System.out.println("Name is : "+ name);
        System.out.println("Gender is : "+ gender);
        System.out.println("Age is : "+ age);


        // Casting : conversion from one type to another type
        // Narrowing : ( larger to smaller )
        double value = 8.98;
        int newValue = (int) value;  // newValue will = 8
        // Widening ( promotion ) : convert from smaller to larger ( done automatically )
        int intNum = 40;
        long longNum = intNum; // widening
        float floatNum = intNum; // widening
        // byte , short , int , long , float, double

    }
}
