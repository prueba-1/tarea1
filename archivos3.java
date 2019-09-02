/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author ALUMNO - FIIS
 */
public class archivos3 {
    ArrayList <datos3> listaproducto = new ArrayList<>();
    File arch = new File("Producto12.txt");
    
    void agregar(datos3 p){
        if(buscarnombre(p)){
            listaproducto.add(p);
            JOptionPane.showMessageDialog(null, "el producto fue agregado");
        }
        else{
            JOptionPane.showMessageDialog(null, "el producto ya exite");
        }
    }
    String listar(){
        String cad="";
        for(int i = 0; i<listaproducto.size();i++){
            cad+=listaproducto.get(i).toString();
        }
        return cad;
    }
    
    Boolean buscarnombre(datos3 p){
        Boolean band=true;
        for(int i=0; i<listaproducto.size() ; i++){
            if(listaproducto.get(i).getAnios()==p.getAnios()){
                band=false;
                break;
            }
        }
        return band;
                
    }
    void leer() throws IOException{
        if(!arch.exists()){
            arch.createNewFile();
        }
        FileReader fr = new FileReader(arch);
        BufferedReader br = new BufferedReader(fr);
        while(true){
            String text;
            text=br.readLine();
            if(text==null)break;
            String arr[]=text.split(",");
            listaproducto.add(new datos3(arr[0],arr[1],arr[2],arr[3],arr[4],Integer.parseInt(arr[5]),Integer.parseInt(arr[6]),arr[7]) );
        }
        fr.close();
        br.close();
    }
    void escribir() throws IOException{
        if(!arch.exists()){
            arch.createNewFile();
        }
        FileWriter fw = new FileWriter(arch);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);
        for(int i=0 ; i<listaproducto.size();i++){
            pw.println(listaproducto.get(i).tostrinG());
        }
        fw.close();
        bw.close();
        pw.close();
    }
}


