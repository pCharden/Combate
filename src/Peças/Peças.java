/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Peças;

/**
 *
 * @author Charden
 * 
 * 
 * 
 */
  
abstract public class Peças{
    
    protected boolean CPU;
    protected String nome;
    protected boolean visível;
    protected boolean móvel;
    
    public boolean getCPU(){
        return this.CPU;
    }
    public void setCPU(boolean novovalor){
        this.CPU = novovalor;
    }
    
    public String getNome(){
        return this.nome;       
    }       
    public void setNome(String novonome){
        this.nome = novonome;
    }
    
    public boolean getVisível(){
        return this.visível;
    }
    public void setVisível(boolean novovalor){
        this.visível = novovalor;
    }
        

    public void batalha(Peças 1, Peças 2){
        
        if(this.nome=="Bomba"){
            
        }
        if(this.nome == "Bandeira"){
        
        }   
         
        this.setVisível(true);
    }
    
}