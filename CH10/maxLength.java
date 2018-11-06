/*
 *  Write a method maxLength that takes an ArrayList of Strings as a parameter and that returns the length of the longest 
 *  string in the list. If your method is passed an empty list, it should return 0.
 */

public static int maxLength(ArrayList<String> list) {
    int max = 0;
    for (int i = 0; i < list.size(); i++) {
        String s = list.get(i);
        if (s.length() > max) {
            max = s.length();
        }
    }
    return max;
}
