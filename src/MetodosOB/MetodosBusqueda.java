/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MetodosOB;

/**
 *
 * @author joyolaa
 */
public class MetodosBusqueda extends MetodosManipuladores{
    
    public MetodosBusqueda(int[] list){
        super(list);
    }
    
    public int secuencial(int numero){
        for(int i = 0;i<super.lista.length;i++){
            if(super.lista[i]==numero){
                return i;
            }
        }
        return -1;
    }
    
    public int binaria(int numero){
        int izq = 0, der = super.lista.length-1,centro = 0;
        
        while(izq<=der){
            centro = (izq+der)/2;
            if(super.lista[centro]==numero){
                return centro;
            }else{
                if(numero<super.lista[centro]){
                    der = centro-1;
                }else{
                    izq = centro+1;
                }
            }
        }
        
        return -1;
    }
}
