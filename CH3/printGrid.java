/*
 *  Write a method named printGrid that accepts two integer parameters rows and cols. The output is a comma-separated 
 *  grid of numbers where the first parameter (rows) represents the number of rows of the grid and the second parameter 
 *  (cols) represents the number of columns. The numbers count up from 1 to (rows x cols). The output are displayed in 
 *  column-major order, meaning that the numbers shown increase sequentially down each column and wrap to the top of 
 *  the next column to the right once the bottom of the current column is reached. Assume that rows and cols are greater than 0.
 */

/*
 *  Here are some example calls to your method and their expected results:
 *    Call:	printGrid(3, 6);      printGrid(5, 3);      printGrid(4, 1);      printGrid(1, 3);
 *  Output:	1, 4, 7, 10, 13, 16   1, 6, 11              1                     1, 2, 3
 *          2, 5, 8, 11, 14, 17   2, 7, 12              2
 *          3, 6, 9, 12, 15, 18   3, 8, 13              3
 *                                4, 9, 14              4
 *                                5, 10, 15
 */
 

public static void printGrid(int rows, int cols){
    int countNumber = 0;
    int printNumber = 1;
    int commaStopper = cols - 1;
    while(countNumber < rows){    
        for(int i = 0; i < cols; i++){
         
            if(i == commaStopper){
                System.out.print(printNumber);
            }
            else{
                System.out.print(printNumber + ", ");
            }
            printNumber = printNumber + rows;
        }
        System.out.println();
        countNumber = countNumber + 1;
        printNumber = countNumber;
        printNumber = printNumber + 1;
    }
}
