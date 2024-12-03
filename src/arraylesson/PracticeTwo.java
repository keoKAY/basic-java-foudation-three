package arraylesson;

public class PracticeTwo {
    public static void main(String[] args) {
        //        Ctrl + /
        // Ctrl + Shift + /
        /*
        int[] scores = {1,2,3,5,6,7,8};

        System.out.println("All Scores (Normal Order ): ");
        // 0 , 1 , 2 , 3 ..... length-1
        for( int i = 0; i < scores.length; i++ ) {
            System.out.print(scores[i] + " ");
        }
        System.out.println();


        // length -1 , ..... 0
        System.out.println("All Scores (Reverse Order ): ");
        for( int i = scores.length-1;  i >=0 ; i-- ) {
            System.out.print(scores[i] + " ");
        }
        System.out.println();
        */


        // means that we have 2d arrays
        // represent the table where we have 3 rows and 2 col
//        String[][] condo = new String[3][2];


        // jagged array
        int[][] condo  = {
                { 1 ,2 ,3 },
                {4, 5,  6 },
                {7, 8, 9}
        };

//        condo[0][0]= 1;
//        condo[2][2]= 9;
        // count the row
        System.out.println("Row: " +condo.length);
        // count the col in specific row
        System.out.println("Col in row = 0 : "+ condo[0].length);



        // Writing loop to iterate over the given array
        for(int i =0 ; i< condo.length; i++){
            for(int j = 0; j< condo[i].length; j++){
                System.out.print(condo[i][j]+" ");
            }
            System.out.println();
        }
    }
}
