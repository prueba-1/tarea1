/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

/**
 *
 * @author ALUMNO - FIIS
 */
public class datos3 {
private String tipo ;
    private String titulo ;
    private String director ;
    private String inters ;
    private String anios ;  
    private int precio ;
    private int plaso;
    private String estado;

    public datos3(String tipo, String titulo, String director, String inters, String anios, int precio, int plaso, String estado) {
        this.tipo = tipo;
        this.titulo = titulo;
        this.director = director;
        this.inters = inters;
        this.anios = anios;
        this.precio = precio;
        this.plaso = plaso;
        this.estado = estado;
    }


    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getInters() {
        return inters;
    }

    public void setInters(String inters) {
        this.inters = inters;
    }

    public String getAnios() {
        return anios;
    }

    public void setAnios(String anios) {
        this.anios = anios;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getPlaso() {
        return plaso;
    }

    public void setPlaso(int plaso) {
        this.plaso = plaso;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "metodosinterfas3{" + "tipo=" + tipo + ", titulo=" + titulo + ", director=" + director + ", inters=" + inters + ", anios=" + anios + ", precio=" + precio + ", plaso=" + plaso + ", estado=" + estado + '}';
    }
    
    
    
    
    public String tostrinG(){
       return tipo + "," + titulo + "," + director + "," + inters + "," + anios + "," + precio + "," + plaso + "," + estado;
 
    }
    


        
        
}
