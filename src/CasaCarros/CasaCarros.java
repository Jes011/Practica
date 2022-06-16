/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CasaCarros;

/**
 *
 * @author joyolaa
 */
public class CasaCarros {

    public static void main(String args[]) {
        Carro[] a = new Carro[6];

        MetodosManipuladores[] aaaa = new MetodosManipuladores[2];
        aaaa[0] = new MetodosOrdenamiento(a);
        aaaa[1] = new MetodosDeBusqueda(a);

        Carro carrito = new Carro();
        carrito.setPrecio(345435);
        a[0] = carrito;
        carrito = new Carro();
        carrito.setPrecio(111111);
        a[1] = carrito;
        carrito = new Carro();
        carrito.setPrecio(999999);
        a[2] = carrito;
        carrito = new Carro();
        carrito.setPrecio(222222);
        a[3] = carrito;

        for (int i = 0; i < 4; i++) {
            System.out.println(a[i].getPrecio());
        }
        ((MetodosOrdenamiento) aaaa[0]).quickSort(0, 3);
        System.out.println("-----------");
        for (int i = 0; i < 4; i++) {
            System.out.println(a[i].getPrecio());
        }
    }

}
