package ee_t01_arrays;

import java.io.*;
import javax.swing.*;
public class Archivo
{
    String linea;
    String arreglo[];
    int num[];
    public void leerArchivo(String nombre){
        int contador=0;
        try{
            FileReader fr = new FileReader(nombre);
            BufferedReader br = new BufferedReader(fr);
            linea=br.readLine();
            while(linea!=null){
                System.out.println(linea);
                arreglo=linea.split("");
                linea=br.readLine();
            }
            num=new int[arreglo.length];
        }catch(FileNotFoundException f){
            JOptionPane.showMessageDialog(null,"Exception "+f);
        }catch(IOException i){
            JOptionPane.showMessageDialog(null,"Exception "+i);
        }
    }
    public void descendente(){
        int aux;
        for(int i=0; i<num.length; i++){
            num[i]=Integer.parseInt(arreglo[i]);
            for(int j=i+1; j<num.length; j++){
                if(num[i]>num[j]){
                    aux=num[i];
                    num[i]=num[j];
                    num[j]=aux;
                }
            }
        }
    }
    public void imprimir(){
        for(int i=0; i<num.length; i++){
            System.out.println(num[i]);
        }
    }
}