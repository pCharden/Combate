/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Peças;

/**
 *
 * @author Charden
 */
      
abstract public class Peças{
    
    private String nome;
    private boolean visível;
    private boolean móvel;
    
    private boolean getVisível(){
        return visível;
    }
    private void setVisível(boolean valor){
        visível = valor;
    }
        

    private batalha(){
        
        if(this.nível)
            
         this.setVisível(true);
    }
    
}