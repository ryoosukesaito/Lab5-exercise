/*
Make a record to store information about a car. It should contain fields for: - make (String) - model (String) - year (int)
Create an ArrayList of Car objects.
Sort the ArrayList of cars by year (Ascending) and print them out.
 */


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


class Lab3Q3 implements Comparable<Lab3Q3> {
    private String make;
    private String model;
    private int year;
    
    public Lab3Q3(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car [make=" + make + ", model=" + model + ", year=" + year + "]";
    }

    // @Override
    // public int compareTo(Car o) {
    //     if(year == o.year){
    //         return 0;
    //     }else if(year > o.year){
    //         return 1;
    //     }else{
    //         return -1;
    //     }
    // }

    


public static void question3() {
    ArrayList<Lab3Q3> cars = new ArrayList<>();

    cars.add(new Lab3Q3("Jeep", "Wrangler", 1986));
    cars.add(new Lab3Q3("Honda", "Civic", 1975));
    cars.add(new Lab3Q3("Toyota", "Camry", 1982));

    for(Lab3Q3 car: cars){
        System.out.println("Element: " +car);
    }

    System.out.println("-----");

    // cars.sort(null);
    cars.sort((Comparator<? super Lab3Q3>) new Comparator<Lab3Q3>() {

        @Override
        public int compare(Lab3Q3 o1, Lab3Q3 o2) {
           return o2.getYear() - o1.getYear();
        }
        
    });

    for(Lab3Q3 car: cars){
        System.out.println("Element: " +car);
    }

}

public static void main(String[] args) throws Exception {
    // question1();
    // question2();
    question3();
}

@Override
public int compareTo(Lab3Q3 o) {
    // TODO Auto-generated method stub
    return 0;
}
}

