/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MetodosOB;

/**
 *
 * @author joyolaa
 */
public abstract class MetodosManipuladores {
    protected int[] lista;
    
    public MetodosManipuladores(int[] lista){
        this.lista = lista;
    }
    
    public void cambiar(int pos1,int pos2){
        int elemento = this.lista[pos1];
        this.setElemento(pos1, this.lista[pos2]);
        this.setElemento(pos2, elemento);
    }
    
    public int getElemento(int pos){
        return this.lista[pos];
    }
    
    private void setElemento(int pos,int valor){
        this.lista[pos] = valor;
    }
    
}
