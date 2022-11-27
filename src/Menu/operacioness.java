package Menu;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author david
 */
public class operacioness{

    Object cantidad;
    public void op(double  cantidad ,double salario, double  total){
        
     if (cantidad <=99){
          salario =(cantidad*2)+(salario) +salario /4;
        
         
     }   else {
         
     }
     if(cantidad <=199){
           salario = ((cantidad * 2) + (salario * 0.10) + salario) / 4;
           
         }else{
         if(cantidad>=200){
       salario = ((cantidad * 2) + (salario * 0.12) + salario) / 4;     
         } 
     }
    }

    }
    
    
    
   
    
    

  
   