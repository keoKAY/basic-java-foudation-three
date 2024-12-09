package arraylesson;

import java.util.Scanner;

// Condo management system
// buy , sell , show , search !
public class PracticeThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int row, col , option;
        int floorNum, roomNum;
        System.out.println("Enter the number of floor: ");
        row = input.nextInt();
        System.out.println("Enter the number of rooms: ");
        col = input.nextInt();
        // allocate memory for condo array
        String[][]   condo= new String[row][col];

        System.out.println("====<<You have successfully setup condo! >====");
        System.out.println("Total Rooms: "+(row*col)+" rooms");
        System.out.println("Room in each floor : "+ col+" rooms");
        System.out.println("Total Floors: "+ (row) + " floors");


        // show the number of floor and number of room in each floor
        do {

            System.out.println("=======<<Main Menu>>=======");
            System.out.println("1. Buy condo ");
            System.out.println("2. Sell condo ");
            // search
            System.out.println("3. Show condo information ");
            System.out.println("4. Exit");

            System.out.println("Choose option (1-4): ");
            option = input.nextInt();

            switch (option) {
                case 1:
                    System.out.println("--------- Buy Condo--------- ");
                    System.out.println("Enter the floor number(1-"+row+")");
                    floorNum = input.nextInt();
                    System.out.println("Enter the room number( 1-"+col+")");
                    roomNum = input.nextInt();


                    if(condo[floorNum-1][roomNum-1]==null){
                        System.out.println("Enter your name to buy the condo : ");
                        input.nextLine();// clear buffer
                        String name = input.nextLine();
                        condo[floorNum-1][roomNum-1] = name;
                    }else{
                        System.out.println("Sorry! This room already has an owner!");
                        System.out.println("Owner name: "+(condo[floorNum-1][roomNum-1]));
                    }

                    break;

                case 2 :
                    System.out.println("---------Sell Condo--------- ");
                    break;
                case 3:
                    System.out.println("-------Show condo information-------");

                    // more updates here !
                    for(int i =row-1; i >=0; i--){
                        System.out.print("Floor "+(i+1)+": ");
                        for(int j =0; j < col; j++){
                            System.out.print(condo[i][j]+" ");
                        }
                        System.out.println();
                    }

                    break;

                case 4 :
                    System.out.println("Exit the program!!! ");
                    break;
            }
        }while(option!=4);

    }
}
