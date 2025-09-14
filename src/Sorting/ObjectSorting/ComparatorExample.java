package Sorting.ObjectSorting;

import java.util.*;

    /*
    Comparator :::
         Comparator -> sorts collections of objects based on the Custom order of sorting
         The class must implement Comparator for comparing object
         Note : Here developer can customize condition based on their requirement
          One can compare objects based on one or  more than one attribute at the same time
     */
class LuxuryVehicle{
    private int id;
    private String model;
    private int yearOfManuf;

    public LuxuryVehicle() { }

    public LuxuryVehicle(int id, String model, int yearOfManuf) {
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

//    @Override
//    public int compare(LuxuryVehicle o1, LuxuryVehicle o2) {
//        int yearOfManufCompare = o1.getYearOfManuf() - o2.getYearOfManuf();
//        if(yearOfManufCompare != 0)return yearOfManufCompare;
//        else {
//            return (o1.getModel().compareTo(o2.getModel()));
//        }
//    }
}
public class ComparatorExample {
    public static void main(String[] args)  {
        LuxuryVehicle car = new LuxuryVehicle(1,"x-series",2006);
        LuxuryVehicle bike = new LuxuryVehicle(2,"aa-sries",2015);
        LuxuryVehicle car2 = new LuxuryVehicle(3,"zz-series",2008);
        LuxuryVehicle bike2 = new LuxuryVehicle(4,"fat-sries",2006);

        List<LuxuryVehicle> list = new ArrayList<>();
        list.add(car);
        list.add(bike);
        list.add(car2);
        list.add(bike2);

        // by implementing Comparstor interface
        //Collections.sort(list, new LuxuryVehicle());

        // Optimize version without implementing comparator interface
        // Object sorting on single criteria i.e. year of manufacturing
//        Collections.sort(list, new Comparator<LuxuryVehicle>() {
//            @Override
//            public int compare(LuxuryVehicle o1, LuxuryVehicle o2) {
//                return o2.getYearOfManuf() - o1.getYearOfManuf();
//            }
//        });
        // Object sorting more than one criteria i.e. year of manufacturing and model
        // Here First it compares based on the year of manufacturer - if it is same then goes to second criteria.
        Collections.sort(list, new Comparator<LuxuryVehicle>() {
            @Override
            public int compare(LuxuryVehicle o1, LuxuryVehicle o2) {
                int yearOfManufacture = o1.getYearOfManuf() - o2.getYearOfManuf();
                if(yearOfManufacture != 0){
                    return yearOfManufacture;
                }else{
                    return o1.getModel().compareTo(o2.getModel());
                }
            }
        });
        for(LuxuryVehicle v:list){
            System.out.println(v.getId() + ", " + v.getModel() + " , "+ v.getYearOfManuf());
        }

    }
}
