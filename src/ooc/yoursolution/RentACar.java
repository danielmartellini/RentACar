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
public class RentACar implements RentACarInterface {

    List<CarInterface> cars;
    String name;

    public RentACar() {
    }

    public RentACar(String name) {
        this.name = name;
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
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean checkAvailability(Month month, int day, Make make, int lengthOfRent) {
        int rentDay;
        int stop;

        for (CarInterface car : cars) {
            if (car.getMake().equals(make)) {
                rentDay = day;
                stop = 0;
                for (int i = 0; i < lengthOfRent; i++) {
                    if (!car.isAvailable(month, rentDay++)) {
                        stop=1;
                        break;
                        
                    }
                }
                
                if (stop==0){
                return true;
                }

            }
        }
        return false;
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
