package Recursion;

/**
 * Prints recursively a Sierpinski Carpet
 *
 * @author Shivang Chaudhary
 */

public class SierpinskiCarpet {

    static int n = 3;
    static int size = (int) Math.pow(3, n);
    static char[][] board = new char[size][size];

   /*
   * The following objects stores the starting and ending points of squares
   * of character to be edited .
   *
   * The variables in the following signify all the points of the square targeted.
   *  */

    private static void updateSquare(int xOffset, int yOffset, int size) {

        int x1 = xOffset;
        int x2 = xOffset + size;
        int y1 = yOffset;
        int y2 = yOffset + size;

        for (int i = x1; i < x2; i++) {
            for (int j = y1; j < y2; j++) {
                board[i][j] = ' ';
            }
        }
    }


    /*
    * Following object updates and selects the square to be edited.
    * */

    private static void calcThenUpdateMiddleSquare(int x, int y, int m) {
        // middle square is offset + 3 ^ n-1
        int subSize= (int) Math.pow(3, m-1);
        int xOffset= x+subSize;
        int yOffset= y+subSize;
        updateSquare(xOffset, yOffset,subSize);
    }




    private static void subSquare(int m, int xOffset, int yOffset) {
        if (m <=1 ) { // base case
            calcThenUpdateMiddleSquare(xOffset, yOffset, m);
        }else {
            //find all the sub-squares

            int subSize = (int) Math.pow(3, m-1);
            int noOfSubsquares = 9;  //(int) size/subSize *2
            int[] xOffsets = new int[noOfSubsquares];
            int[] yOffsets = new int[noOfSubsquares];
            int k = 0;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    xOffsets[k] = xOffset + i * subSize;
                    yOffsets[k++] = yOffset + j * subSize;

                }
            }
            for (int i = 0; i < 9; i++) {
                subSquare(m-1, xOffsets[i], yOffsets[i]);
            }
            //calculate middle squire of the subsquires then update
            calcThenUpdateMiddleSquare(xOffset, yOffset, m);

        }
    }

    public static void main(String[] args) {
        // Initialize the board with character *
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j] = '*';
            }
        }

        subSquare(n,0,0);

        // Print final board
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}