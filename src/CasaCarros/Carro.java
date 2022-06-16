/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CasaCarros;

/**
 *
 * @author joyolaa
 */
public class Carro {
    
    private String marca,matricula;
    private double precio;
    
    public Carro(){
        this.marca = "";
        this.matricula = "";
        this.precio = 0;
    }
    
    public void setMarca(String marca){
        this.marca=marca;
    }
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    public void setPrecio(double precio){
        this.precio = precio;
    }
    
    public String getMarca(){
        return this.marca;
    }
    public String getMatricula(){
        return this.matricula;
    }
    public double getPrecio(){
        return this.precio;
    }
    
}
