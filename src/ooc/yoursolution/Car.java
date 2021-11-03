/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooc.yoursolution;

import java.util.HashMap;
import java.util.Map;
import ooc.enums.Make;
import ooc.enums.Month;

/**
 *
 * @author danie
 */
public class Car implements CarInterface {

    private Make make;
    private double rate;
    private int id;
    private Map<Month, boolean[]> availability;

    public Car(Make make, double rate, int id) {
        this.make = make;
        this.rate = rate;
        this.id = id;
        //this bit of the code is gonna run for every new car(46 times) creating a calendar for each car
        createAvailability();
       

    }

    @Override
    public Map<Month, boolean[]> createAvailability() {
        availability = new HashMap<>();
        //dayStatus true=available false=booked
        int nDays=0;
        Month[] months = Month.values();

        for (Month month : months) {
            // System.out.println(m);
            nDays = month.getNumberOfDays();
            //System.out.println(nDays);
            boolean[] dayStatus = new boolean[nDays];

            for (int i = 0; i < nDays; i++) {
                // System.out.println(month.toString());
                //System.out.println(i);
                dayStatus[i] = true;
                //System.out.println(dayStatus[i].toString());
                availability.put(month, dayStatus);

            }
        }

        return availability;
    }

    @Override
    public Make getMake() {
        return make;
    }

    @Override
    public void setMake(Make make) {
        this.make = make;
    }

    @Override
    public double getRate() {
        return rate;
    }

    @Override
    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public Map<Month, boolean[]> getAvailability() {

        return availability;
    }

    @Override
    public void setAvailability(Map<Month, boolean[]> availability) {
        this.availability=availability;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public boolean isAvailable(Month month, int day) {
        boolean[] available = availability.get(month);
        if(available [day-1]== false){
        } else {
            available[day-1]= true;
        }
        return available[day-1];
    }

    @Override
    public boolean book(Month month, int day) {
        
        if (availability.get(month)[day-1]) {
            availability.get(month)[day-1] = false;
            return true;
        }
 
        return false;
    }


    @Override
    public String toString() {
        return "Car{" + "make=" + make + ", rate=" + rate + ", id=" + id + '}';
    }

}
