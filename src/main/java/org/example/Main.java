package org.example;

import jdk.jshell.SourceCodeAnalysis;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leerDato=new Scanner(System.in);
        String nombreProducto;
        String nombreDistribuidor;
        int cantidadProducto;
        double costoLote;
        double costoVentaPublico;
        double totalCompra;

        //Porceso

        System.out.println("***********");
        System.out.println("Frugal SAS");
        System.out.println("***********");


        System.out.println("Bienvenido a Frugal, ingresa por favor el nombre del producto que ingreso a bodega");
        nombreProducto=leerDato.nextLine();

        System.out.println("Digita el distribuidor del producto?");
        nombreDistribuidor= leerDato.nextLine();

        System.out.println("Por favor ingresa el costo del lote");
        costoLote= leerDato.nextDouble();

        System.out.println("*********************************************");
        System.out.println("Resumen ingreso mercancia ");
        System.out.println("Lote que entra" +nombreProducto);
        System.out.println("Costo Lote $" +costoLote);
        System.out.println("Entregado por" +nombreDistribuidor);
        System.out.println("*********************************************");


        System.out.println("\n +++++++++++Venta al detal+++++++++++++++ \n");
        costoVentaPublico=5000;

        System.out.println("Apreciado usuario, el costo unitario de" +nombreProducto+"es de $" +costoVentaPublico);

        System.out.println("Digita la cantidad de " +nombreProducto+"que quieres comprar");
        cantidadProducto= leerDato.nextInt();

        //calculando el valor de una variable
        totalCompra=costoVentaPublico*cantidadProducto;

        System.out.println("El valor de su compra es de $"+totalCompra);
    }
}