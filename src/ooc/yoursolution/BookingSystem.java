/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooc.yoursolution;

import java.io.BufferedReader;
import java.io.IOException;

/**
 *
 * @author danie
 */
public class BookingSystem implements BookingSystemInterface {
 
    @Override
    public RentACarInterface setupRentACar(BufferedReader in) throws IOException {
        String rental = in.readLine();
        String content= "";
        
       RentACarInterface rentACar = new RentACar();
        
        while(rental != null){
            System.out.println(rental);
           // content = in.readLine();
            //System.out.println(content);
            rental = in.readLine();}
//                
//            Car cars = new Car(content);
//            .addItem(cars);
//            
//            
//        
    
  return rentACar;
}
    
    @Override
    public String toString() {
        return "BookingSystem{" + '}';
    }

    

}