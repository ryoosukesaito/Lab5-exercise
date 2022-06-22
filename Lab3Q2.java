/* 
Create an ArrayList of Integers
Fill the ArrayList with ten random numbers (1-50)
Copy each value from the ArrayList into another ArrayList of the same capacity
Change the last value in the first (original) ArrayList to a -5
Display the contents of both ArrayLists 
*/




import java.util.ArrayList;
import java.util.Random;

public class Lab3Q2 {

	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<>();

    arrayList.add(0);
    arrayList.add(1);
    arrayList.add(2);
    arrayList.add(3);
    arrayList.add(4);
    arrayList.add(5);
    arrayList.add(10);
    arrayList.add(14);
    arrayList.add(25);
    arrayList.add(36);
    arrayList.add(47);
    arrayList.add(49);
		
		ArrayList<Integer> arrayList2 = (ArrayList<Integer>) arrayList.clone();

		System.out.println(arrayList);
		System.out.println(arrayList2);
		// int numArray = 
		arrayList2.set(arrayList2.size() - 1,-5);

		System.out.println(arrayList2);
	}

}