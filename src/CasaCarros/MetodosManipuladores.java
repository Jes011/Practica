/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CasaCarros;

/**
 *
 * @author joyolaa
 */
public class MetodosManipuladores {
    
    protected Carro[] listaCarros;
    
    public MetodosManipuladores(Carro[] listacarros){
        this.listaCarros = listacarros;
    }
    
    public void setCarro(int pos,Carro carro){
        this.listaCarros[pos] = carro;
    }
    public Carro getCarro(int pos){
        return this.listaCarros[pos];
    }
    
    public void cambiarElementos(int pos1,int pos2){
        Carro carro = this.listaCarros[pos1];
        this.setCarro(pos1,this.listaCarros[pos2]);
        this.setCarro(pos2, carro);
    }
}
