package Sorting.ObjectSorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


    /*
    Comparable ::::
         Comparable compares two objects based on the Natural order of sorting
          The class must implement Comparable  need to override compare method
    */
class Vehicle implements Comparable<Vehicle>{
    private int id;
    private String model;
    private int yearOfManuf;

    public Vehicle() { }

    public Vehicle(int id, String model, int yearOfManuf) {
        this.id = id;
        this.model = model;
        this.yearOfManuf = yearOfManuf;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfManuf() {
        return yearOfManuf;
    }

    public void setYearOfManuf(int yearOfManuf) {
        this.yearOfManuf = yearOfManuf;
    }

    @Override
    public int compareTo(Vehicle o) {
        if(yearOfManuf > o.yearOfManuf) return 1;
        else if( yearOfManuf < o.yearOfManuf) return -1;
        else return 0;
    }
}
public class ComparableExample {
    public static void main(String[] args) {
        Vehicle car = new Vehicle(1,"x-series",2006);
        Vehicle bike = new Vehicle(2,"aa-sries",2015);
        Vehicle car2 = new Vehicle(3,"zz-series",2008);
        Vehicle bike2 = new Vehicle(4,"fat-sries",2010);

        List<Vehicle> list = new ArrayList<>();
        list.add(car);
        list.add(bike);
        list.add(car2);
        list.add(bike2);


        List<Integer> list1= Arrays.asList(8,9,1,3,4,6,7,55);
        Collections.sort(list);      // sort method is used to sort collection of objects
        for(Vehicle v:list){
            System.out.println(v.getId() + ", " + v.getModel() + " , "+ v.getYearOfManuf());
        }

    }
}
