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
        //read the line again so the fact that the name didn't have a : wont make the code crash
        content = in.readLine();
        
        RentACarInterface rentACar = new RentACar(rental);
        ArrayList<CarInterface> cars = new ArrayList<>();
        
        while(content != null){
            data = content.split(":");
            //System.out.println(data[0]);
            //System.out.println(data[1]);
            //System.out.println(data[2]);
            Car car= new Car(Make.valueOf(data[0]),Double.parseDouble(data[1]),Integer.parseInt(data[2]));
            System.out.println(car);
            cars.add(car);
            
            
            
            //System.out.println(content);
           // content = in.readLine();
            //System.out.println(content);
            content = in.readLine();}
//                
            System.out.println(cars);
            rentACar.setCars(cars);
            
            
            
            
            
      
    
  return rentACar;
}

   

    
    
    @Override
    public String toString() {
        return "BookingSystem{" + '}';
    }

    

}