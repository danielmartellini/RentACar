/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooc.yoursolution;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import ooc.enums.Make;

/**
 *
 * @author danie
 */
public class BookingSystem implements BookingSystemInterface {
 
    @Override
    public RentACarInterface setupRentACar(BufferedReader in) throws IOException {
        String content = in.readLine();
        String rental= content;
        String [] data = null;
        int counter=0;
        //used to id the cars from 1 to the number of cars available
        int identifier=1;
        //read the line again so the fact that the name didn't have a : wont make the code crash
        content = in.readLine();
        
        RentACarInterface rentACar = new RentACar(rental);
        ArrayList<CarInterface> cars = new ArrayList<>();
        
        while(content != null){
            data = content.split(":");
            //System.out.println(data[0]);
            //System.out.println(data[1]);
            //System.out.println(data[2]);
            while(counter<Integer.parseInt(data[2])){
            Car car= new Car(Make.valueOf(data[0]),Double.parseDouble(data[1]), identifier);
            counter++;
            identifier++;
            //System.out.println(car);
            cars.add(car);
            
            }
            counter=0;
            
           
            
            
            //used to go to the next line
            content = in.readLine();}
//                
            //System.out.println(cars);
            rentACar.setCars(cars);
            
            
            
            
            
      
    
  return rentACar;
}

   

    
    
    @Override
    public String toString() {
        return "BookingSystem{" + '}';
    }

    

}