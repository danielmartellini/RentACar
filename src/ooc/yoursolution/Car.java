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
public class Car implements CarInterface{
    
    public Make make;
    public double rate;
    public int id;
    public Map myMap;
    
   
    public Car(Make make,double rate, int id){
        this.make=make;
        this.rate=rate;
        this.id=id;
        this.myMap= new HashMap<>();
        createAvailability();
        
       
    }

    @Override
    public Map<Month, boolean[]> createAvailability() {
        
       //dayStatus true=available false=booked
       int nDays = 0;
       Month[] months = Month.values();
       
       for(Month month: months){
            // System.out.println(m);
             nDays= month.getNumberOfDays();
             //System.out.println(nDays);
             boolean [] dayStatus= new boolean[nDays];
             
             for(int i=0; i<nDays; i++){
                 System.out.println(month.toString());
                 dayStatus[i]= true;
                //System.out.println(dayStatus[i].toString());
                 myMap.put(month, dayStatus);
                 
                     }  
       }
        System.out.println(myMap);
              
  return myMap;
    }

    @Override
    public Make getMake() {
        return make;
    }

    @Override
    public void setMake(Make make) {
         this.make=make;
    }

    @Override
    public double getRate() {
        return rate;
    }

    @Override
    public void setRate(double rate) {
        this.rate=rate;
    }

    @Override
    public Map<Month, boolean[]> getAvailability() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setAvailability(Map<Month, boolean[]> availability) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public boolean isAvailable(Month month, int day) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean book(Month month, int day) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "Car{" + "make=" + make + ", rate=" + rate + ", id=" + id + '}';
    }
    
}
