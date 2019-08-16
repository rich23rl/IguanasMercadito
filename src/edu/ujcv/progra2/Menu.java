package edu.ujcv.progra2;

import java.util.Scanner;

public class Menu { public int menu() {
    System.out.println("\t\tMenu de Mercadito");
    System.out.println("1.Productos \n2.Clientes \n3.Factura \n4.SALIR");
    int opcion = 0;
    while ((opcion < 1) || (opcion > 5)) {
        System.out.println("Ingresar Una Opcion: ");
        Scanner Sc = new Scanner(System.in);
        opcion = Sc.nextInt();
        if ((opcion < 1) || (opcion > 5)) {
            System.out.println("Opcion No Invalida.");
        }
    }
    return opcion;
}
    public int MenuDeClientes() {
        System.out.println("");
        Scanner Sc = new Scanner(System.in);
        System.out.println("Menu de clientes");
        System.out.println("1.Agregar Clientes \n2.Ver Clientes \n3.Eliminar Cliente \n4.Modificar cliente \n5.SALIR");
        int opcion = 0;
        while ((opcion < 1) || (opcion > 6)) {
            System.out.println("Ingresar Una Opcion: ");
            Scanner dSc = new Scanner(System.in);
            opcion = Sc.nextInt();
            if ((opcion < 1) || (opcion > 6)) {
                System.out.println("Opcion No Invalida.");
            }
        }
        return opcion;
    }
    public int MenuDeProductos() {
        System.out.println("Menu de Productos");
        System.out.println("1.Agregar Productos \n2.Ver Producto \n3.Eliminar Producto \n4.Modificar Porducto \n5.SALIR");
        int opcion = 0;
        while ((opcion < 1) || (opcion > 6)) {
            System.out.println("Ingresar Una Opcion : ");
            Scanner Sc = new Scanner(System.in);
            opcion = Sc.nextInt();
            if ((opcion < 1) || (opcion > 6)) {
                System.out.println("Opcion No Invalida.");
            }
        }
        return opcion;
    }
}