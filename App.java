import java.util.ArrayList;
/*
I want to implement a helper class that allows me to perform simple arithmetic. I'm going to call my class ArrayListHelper.


Constructor: The constructor of the ArrayListHelper should accept an ArrayList of Integers. 
Methods: 
1- Display(): This method returns a string that lists all the elements of the ArrayList that is encapsulated inside the ArrayListHelper. Seperate the elements by a dash
2- Reverse(): This method will reverse the elements of the ArrayList that is encapsulated inside the ArrayListHelper.
3- Append(ArrayList<Integer> arrayListToBeAppended): Takes in an ArrayList of Integers and appends them to the existing ArrayList that is encapsulated inside the ArrayListHelper.
4- Sort(): This method will sort the elements of the ArrayList that is encapsulated insided the ArrayListHelper.

*/

public class App {
        public static void main(String[] args) {

                /*
                 * I am declaring a new ArrayList that will hold even numbers from 0 to 50
                 * inclusive
                 */
                ArrayList<Integer> evenNumbers = new ArrayList<Integer>();

                for (int index = 0; index <= 50; index++) {
                        if (index % 2 == 0)
                                evenNumbers.add(index);
                }
                /************************************************************************************/
                /*
                 * Now I am declaring a new ArrayList that will hold odd numbers from 0 to 50
                 * inclusive
                 */
                ArrayList<Integer> oddNumbers = new ArrayList<Integer>();

                for (int index = 0; index <= 50; index++) {
                        if (index % 2 == 1)
                                oddNumbers.add(index);
                }
                /************************************************************************************/
                /* initialize my ArrayListHelper by supplying it a list of even numbers */
                ArrayListHelper helper = new ArrayListHelper(evenNumbers);
                System.out.println("even numbers: " + helper.Display());
                /*even numbers: 0-2-4-6-8-10-12-14-16-18-20-22-24-26-28-30-32-34-36-38-40-42-44-46-48-50*/
                /************************************************************************************/

                /************************************************************************************/
                helper.Reverse();
                System.out.println("even numbers reversed: " + helper.Display());
                /*even numbers reversed: 50-48-46-44-42-40-38-36-34-32-30-28-26-24-22-20-18-16-14-12-10-8-6-4-2-0*/
                /************************************************************************************/

                /************************************************************************************/
                helper.Append(oddNumbers);
                System.out.println("appending odd numbers: " + helper.Display());
                /*appending odd numbers: 50-48-46-44-42-40-38-36-34-32-30-28-26-24-22-20-18-16-14-12-10-8-6-4-2-0-1-3-5-7-9-11-13-15-17-19-21-23-25-27-29-31-33-35-37-39-41-43-45-47-49 */
                /************************************************************************************/


                /************************************************************************************/
                helper.Sort();
                System.out.println("sorting again.." + helper.Display());
                /*sorting again..0-1-2-3-4-5-6-7-8-9-10-11-12-13-14-15-16-17-18-19-20-21-22-23-24-25-26-27-28-29-30-31-32-33-34-35-36-37-38-39-40-41-42-43-44-45-46-47-48-49-50*/
                /************************************************************************************/

                /************************************************************************************/
                helper.Reverse();
                System.out.println("reversing..." + helper.Display());
                /*reversing...50-49-48-47-46-45-44-43-42-41-40-39-38-37-36-35-34-33-32-31-30-29-28-27-26-25-24-23-22-21-20-19-18-17-16-15-14-13-12-11-10-9-8-7-6-5-4-3-2-1-0*/
                /************************************************************************************/
        }

}
