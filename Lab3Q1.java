/* 
Create an ArrayList of Integers
Fill each of the 10 slots with a random value from 1-50.
Display those values on the screen, and then prompt the user for an integer.
Search through the ArrayList, and if the item is present, print a message that the number is in the list.
If the value is not in the ArrayList, print a message that the number is not in the list */



import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Lab3Q1 {

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

    // System.out.println(arrayList);

    Scanner scan = new Scanner(System.in);
    System.out.println("Imput the number: ");
    int num =scan.nextInt();

    if(arrayList.indexOf(num)<0) System.out.println("the number is not in the list");
    else System.out.println("the number is in the list");
    
    scan.close();
	}

}