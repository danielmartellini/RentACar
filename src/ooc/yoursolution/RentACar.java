/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooc.yoursolution;

import java.util.ArrayList;
import java.util.List;
import ooc.enums.Make;
import ooc.enums.Month;

/**
 *
 * @author danie
 */
public class RentACar implements RentACarInterface{
    
    List<CarInterface> cars;
    String text;
    
    public RentACar(){}
    
    public RentACar (String text){
        this.text=text;
        this.cars = new ArrayList<CarInterface>();
    }

    @Override
    public List<CarInterface> getCars() {
        
        return cars;
    }

    

    @Override
    public void setCars(List<CarInterface> cars) {
       this.cars.addAll(cars);
    }

    @Override
    public String getName() {
        return this.text;
    }

    @Override
    public void setName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean checkAvailability(Month month, int day, Make make, int lengthOfRent) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getCarAvailable(Month month, int day, Make make, int lengthOfRent) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean bookCar(Month month, int day, Make make, int lengthOfRent) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getNumberOfCars() {
        return cars.size();
    }
    
}
