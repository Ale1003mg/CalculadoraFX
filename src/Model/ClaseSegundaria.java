/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Alejandro
 */
public class ClaseSegundaria extends ClasePricipal {
    
    public void Recoger(int dato1, int dato2){
    
       this.Dato1=dato1;
    this.Dato2=dato2;
    }
    
    public int Suma(){
    
  
        
    return Dato1+Dato2;
    }
    
    public int Resta(){
      
    return Dato1-Dato2;
    }
    
    public int Multiplicacion(){
     
    return Dato1*Dato2;
    }
    
    public double Divicion(){
    
    return Dato1/Dato2;
    }
}
