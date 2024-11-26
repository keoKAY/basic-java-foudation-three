import java.util.Scanner;

public class SampleProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int option;

        do{
            System.out.println("1. Wage Calculator");
            System.out.println("5. Exit ");

            System.out.println("Choose (1 - 5) : ");
            option = input.nextInt();
            switch (option){
                case 1:{
                    float hour;
                    float wage;
                    String day;
                    // wages -> 10
                    // hours -> 2 , 3, 4,
                    // SAT, SUN -> result * 2
                    System.out.println("--------------<<<Wage Calculator>>>-------------");
                    System.out.println("Enter hour(hrs): ");
                    hour = input.nextFloat();
                    System.out.println("Enter wage($): ");
                    wage = input.nextFloat();
                    System.out.println("Enter day (ex. MONDAY,...,SUNDAY): ");
                    day = input.next();

                    System.out.println("=======================");
                    System.out.println("Hour is : "+hour + "hrs");
                    System.out.println("Wage is : "+wage+"$/1hrs");
                    System.out.println("Day of work : "+day);
                    System.out.println("=======================");

                }
                    break;
                default:
                    System.out.println("Invalid option!! Try again!");
                    break;
            }
        }while(option!=5);
    }
}
