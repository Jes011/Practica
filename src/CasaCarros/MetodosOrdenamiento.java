/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CasaCarros;

/**
 *
 * @author joyolaa
 */
public class MetodosOrdenamiento extends MetodosManipuladores{
    
    public MetodosOrdenamiento(Carro[] lista){
        super(lista);
    }
    
    public void quickSort(int izq,int der){
        int derecha = der,izquierda = izq;
        Carro pivote = super.listaCarros[izquierda];
        
        while(izquierda<derecha){
            
            while(super.getCarro(izquierda).getPrecio()<=pivote.getPrecio() && izquierda<derecha){
                izquierda++;
            }
            while(super.getCarro(derecha).getPrecio()>pivote.getPrecio()){
                derecha--;
            }
            
            if(izquierda<derecha){
                super.cambiarElementos(izquierda, derecha);
            }
        }
        
        super.setCarro(izq, super.getCarro(derecha));
        super.setCarro(derecha, pivote);
        
        if(der-1>izq){
            this.quickSort(izq, der-1);
        }
        if(der+1<der){
            this.quickSort(der+1, der);
        }
    }
    
    public void burbuja(){
        for(int i= 0;i<super.listaCarros.length-1;i++){
            for(int j = 0;j<super.listaCarros.length-1;j++){
                if(super.getCarro(j).getMatricula().compareTo(super.getCarro(j+1).getMatricula()) <0){
                    super.cambiarElementos(j, j+1);
                }
            }
        }
    }
}
