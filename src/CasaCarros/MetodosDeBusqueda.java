/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CasaCarros;

/**
 *
 * @author joyolaa
 */
public class MetodosDeBusqueda extends MetodosManipuladores{
    
    public MetodosDeBusqueda(Carro[] listaCarros){
        super(listaCarros);
    }
    
    public int Binaria(double valor){
        
        int izq=0,der=super.listaCarros.length-1,centro = 0;
        
        while(izq<der){
            centro = (izq+der)/2;
            if(super.getCarro(centro).getPrecio()==valor){
                return centro;
            }else{
                if(valor<super.getCarro(centro).getPrecio()){
                    der = centro-1;
                }else{
                    izq = centro+1;
                }
            }
        }
        return -1;
    }
}
