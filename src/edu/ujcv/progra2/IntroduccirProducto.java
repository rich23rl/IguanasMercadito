package edu.ujcv.progra2;

import java.util.Scanner;

public class IntroduccirProducto {
    private Scanner Sc = new Scanner(System.in);
    private DymArray<Producto> pda = new DymArray<>();

    public void IntroProducto() {
        System.out.println("Cuantos productos quiere introducir: ");
        int h = Sc.nextInt();
        for (int i = 0; i < h; i++) {
            System.out.println("Introduzca el producto: ");
            String setNombreDeProducto = Sc.next();
            System.out.println("Introduzca la cantidad del producto: ");
            Integer setCantidadDeProducto = Sc.nextInt();
            System.out.println("introduzca el precio");
            Integer setPrecioDeProducto = Sc.nextInt();
            pda.add(new Producto(setNombreDeProducto, setPrecioDeProducto, setCantidadDeProducto));
        }
    }

    public void ImpresionDeProducto() {
        System.out.println("Compra del cliente: ");
        for (int i = 0; i < pda.getSize(); i++) {
            System.out.println(pda.getItem(i));
        }
    }

    public void RemoverProducto() {
        System.out.println("Que numero desea borrar de la lista de productos: ");
        int n= Sc.nextInt();
        pda.remove(n-1);
    }

    public void ModificarProducto(){
        System.out.println("Compra del cliente: ");
        for (int i = 0; i < pda.getSize(); i++) {
            System.out.println(pda.getItem(i));
        }
        System.out.println("Que producto de la lista desea modificar: ");
        int n= Sc.nextInt();
        pda.remove(n-1);

        for (int i = 0; i < n; i++) {
            System.out.println("Introduza el nuevo producto: ");
            String setNombreDeProducto = Sc.next();
            System.out.println("Introduzca la cantidad del producto: ");
            Integer setCantidadDeProducto = Sc.nextInt();
            System.out.println("Introduzca el precio: ");
            Integer setPrecioDeProducto = Sc.nextInt();
            pda.add(new Producto(setNombreDeProducto, setPrecioDeProducto,setCantidadDeProducto));
        }
    }
}