/*
 *  Write a method removeDuplicates that takes as a parameter a sorted ArrayList of Strings and that eliminates any 
 *  duplicates from the list. For example, suppose that a variable called list contains the following values: {"be", 
 *  "be", "is", "not", "or", "question", "that", "the", "to", "to"} After calling removeDuplicates(list); the list 
 *  should store the following values: {"be", "is", "not", "or", "question", "that", "the", "to"}
 *  
 *  Because the values will be sorted, all of the duplicates will be grouped together.
 */

public ArrayList<String> removeDuplicates(ArrayList<String> list){
    int iterator = 0;
    for(int i = 0; iterator < list.size(); i++){
        if(list.indexOf(list.get(iterator)) != list.lastIndexOf(list.get(iterator))){
            list.remove(iterator);
        }else{
            iterator++;
        }
    }
    return list;
}
