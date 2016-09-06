package ee_t01_arrays;

import javax.swing.*;
import java.io.*;
public class ArchivoPrueba{
    static String nombre;
    public static void main(String[] args) {
        Archivo a = new Archivo();
        nombre=JOptionPane.showInputDialog("Ingresa el nombre del archivo a leer");
        System.out.println("Entrada");
        a.leerArchivo("C://Users//angel//Documents//ee_t01_arrays//"+nombre+".txt");
        System.out.println("Salida");
        a.descendente();
        a.imprimir();
        
    }

}



