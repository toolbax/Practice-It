/*
 *  Write a method named coinFlip that accepts as its parameter a Scanner for an input file. Assume that the input 
 *  file data represents results of sets of coin flips that are either heads (H) or tails (T) in either upper or 
 *  lower case, separated by at least one space. Your method should consider each line to be a separate set of coin 
 *  flips and should output to the console the number of heads and the percentage of heads in that line, rounded to 
 *  the nearest tenth. If this percentage is more than 50%, you should print a "You win" message. For example, consider 
 *  the following input file:
 *  
 *  H T H H T
 *  T t   t T h  H
 *     h
 *  For the input above, your method should produce the following output:
 *  
 *  3 heads (60.0%)
 *  You win!
 *  
 *  2 heads (33.3%)
 *  
 *  1 heads (100.0%)
 *  You win!
 *  The format of your output must exactly match that shown above. You may assume that the Scanner contains at least 1 
 *  line of input, that each line contains at least one token, and that no tokens other than h, H, t, or T will be in the lines.
 */

public static void coinFlip(Scanner scan){
    while(scan.hasNextLine()){
        String line = scan.nextLine();
        Scanner scanDeep = new Scanner(line);
        int headCount = 0;
        int totalCount = 0;
        double headPercent = 0.0;
        while(scanDeep.hasNext()){
            String letter = scanDeep.next();
            if(letter.toLowerCase().equals("h")){
                headCount++;
            }
            totalCount++;
        }
        headPercent = ((double)headCount / (double)totalCount) * 100 ;
        System.out.printf(headCount + " heads (%.1f%%)\n", headPercent);
        if(headPercent > 50.0){
            System.out.println("You win!");
        }
        System.out.println();
    }
}
