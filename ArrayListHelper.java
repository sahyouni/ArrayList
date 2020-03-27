
/**
 * Write a description of class ArrayListHelper here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class ArrayListHelper
{
    private ArrayList<Integer>list ;
    private ArrayList<Integer>arrayListToBeAppended;
    

    /**
     * Constructor for objects of class ArrayListHelper
     */
    public ArrayListHelper()
    {
       list = new ArrayList<Integer>(); 
       
    }
    
    /**
     * A method to display of the collection
     */
    public String Display()
    {
        String display = null;
        for(Integer number: list){
           display =  list.toString() + " - ";
        }
        return display;
    }
    
    /**
     * A method to reverse the collection
     */
    public String Reverse()
    {
        String reverse=null;
        ArrayList<Integer> revArrayList = new ArrayList <Integer>();
        for(int i=list.size()-1; i>=0; i--){
        revArrayList.add(list.get(i));
        }
        for(Integer number: revArrayList){
            reverse = revArrayList.toString() + " - ";
        }
        return reverse;
    }
    
    /**
     * A method to Append another arraylist to the existing collection
     */
    public String Append(ArrayList<Integer> arrayListToBeAppended)
    {
        String append=null;
        for(int i = 0; i<arrayListToBeAppended.size(); i++){
            list.add(arrayListToBeAppended.get(i));
        }
        for(Integer number: list){
            append = list.toString() + " - " ;
        }
        return append;
    }
    
    /**
     * A method to sort the collection
     */
    public String Sort()
    {
        String sort = null;
        for(int i = 0; i<list.size()-1; i++){
            for(int j =0; j<list.size()-i-1; j++){
                if(list.get(j)>list.get(j+1)){
                int temp = list.get(j);
                list.set(j,list.get(j+1));
                list.set(j+1,temp);
            }
            }
        }
        for(Integer number: list){
        sort = list.toString()+ " - " ;
        }
        return sort;
    }
}
