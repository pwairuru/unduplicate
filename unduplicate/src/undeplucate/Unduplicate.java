import java.util.ArrayList;
import java.util.List;

public class Unduplicate {

    List list = new ArrayList<Integer>(); //Decare a list of integers

    //default constructor
    public Unduplicate() {
        //populate the list with test data
        list.add(2);
        list.add(12);
        list.add(13);
        list.add(24);
        list.add(6);
        list.add(8);
        list.add(4);
        list.add(8);
        list.add(2);
    }

    /*This is the entry point for the app*/
    public static void main(String[] args) {
        Unduplicate dp = new Unduplicate();
        System.out.println(dp.getDup2());

    }

    //The function to find duplicates.
    private String getDup2() {
        int i = 0;        
        List list2 = new ArrayList<Integer>(); //Declare a second list of integers
        
        while(i < list.size()){
            if(list2.contains(list.get(i))){
                return "Some Duplicate found  - "+list.get(i).toString();  //Exit once you have found the first duplicate
            }
            list2.add(list.get(i));
            
            //dont increament the loop since we are removing the item (to save some memory)
            //and we expect list size to come to zero
            list.remove(list.get(i));  
        }
        
        //If the loop goes to the end , no duplicate found
        return "No duplicate found";
    }
}
