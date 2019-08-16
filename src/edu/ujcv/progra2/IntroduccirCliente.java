package edu.ujcv.progra2;

import java.util.Scanner;

public class IntroduccirCliente {
    private Scanner Sc = new Scanner(System.in);
    private DymArray<Cliente> pda = new DymArray<Cliente>();

    public void IntroducirCliente() {

        System.out.println("Nonmbre del Cliente del Mercadito: ");
        String setNombreDeCliente = Sc.next();
        System.out.println("Ingrese codigo cliente: ");
        int NumeroDeCodigo = Sc.nextInt();
        pda.add(new Cliente(setNombreDeCliente, NumeroDeCodigo));
    }

    public void ImpresionDeClientes() {
        System.out.println("Nonmbre del Cliente con codigo: ");
        for (int i = 0; i < pda.getSize(); i++) {
            System.out.println(pda.getItem(i));
        }
    }

    public void RemoverCliente() {
        for (int i = 0; i < pda.getSize(); i++) {
            System.out.println(pda.getItem(i));
        }
        System.out.println("Numero a borrar en lista de clientes: ");
        Integer n = Sc.nextInt();
        pda.remove(n+1);
    }

    public void ModificarCliente(){
        System.out.println("Compra del Cliente: ");
        for (int i = 0; i < pda.getSize(); i++) {
            System.out.println(pda.getItem(i));
        }
        System.out.println("Que Cliente de la lista desea modificar: ");
        int n= Sc.nextInt();
        pda.remove(n-1);
        System.out.println("Nonmbre del Cliente del Mercadito: ");
        String setNombreDeCliente = Sc.next();
        System.out.println("Ingrese codigo cliente: ");
        int NumeroDeCodigo = Sc.nextInt();
        pda.add(new Cliente(setNombreDeCliente, NumeroDeCodigo));
    }

}
