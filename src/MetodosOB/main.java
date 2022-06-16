/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MetodosOB;

import java.util.Arrays;

/**
 *
 * @author joyolaa
 */
public class main {
    
    public static void main(String args[]){
        
        int indice = -1;
        int[] listaPrueba = new int[10];
        
        listaPrueba[++indice] = 2;
        
        listaPrueba[++indice] = 1;
        
        listaPrueba[++indice] = 0;
        
        listaPrueba[++indice] = 10;
        
        System.out.println(Arrays.toString(listaPrueba));
        
        MetodosManipuladores[] a = {new MetodosOrdenamineto(listaPrueba),new MetodosBusqueda(listaPrueba)};

        System.out.println(indice);
        ((MetodosOrdenamineto)a[0]).quicksort(0, indice);
        
        System.out.println(Arrays.toString(listaPrueba));
        
        System.out.println(((MetodosBusqueda)a[1]).binaria(2));
        
        
    }
}
