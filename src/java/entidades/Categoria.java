package entidades;
// Generated 13/05/2019 10:04:02 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Categoria generated by hbm2java
 */
public class Categoria  implements java.io.Serializable {


     private int idCategoria;
     private String descripcion;
     private char estado;
     private Set productos = new HashSet(0);

    public Categoria() {
    }

	
    public Categoria(int idCategoria, String descripcion, char estado) {
        this.idCategoria = idCategoria;
        this.descripcion = descripcion;
        this.estado = estado;
    }
    public Categoria(int idCategoria, String descripcion, char estado, Set productos) {
       this.idCategoria = idCategoria;
       this.descripcion = descripcion;
       this.estado = estado;
       this.productos = productos;
    }
   
    public int getIdCategoria() {
        return this.idCategoria;
    }
    
    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public char getEstado() {
        return this.estado;
    }
    
    public void setEstado(char estado) {
        this.estado = estado;
    }
    public Set getProductos() {
        return this.productos;
    }
    
    public void setProductos(Set productos) {
        this.productos = productos;
    }




}


