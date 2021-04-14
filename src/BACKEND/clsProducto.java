/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BACKEND;

/**
 *
 * @author Dell
 */
public class clsProducto {

    public clsProducto() {
        
    }
    
    //ATRIBUTOS DE LA CLASE PRODUCTO
    private String Nombre;
    private String Descripcion;
    private int cantidad;
    private double precio;
    private String estatus;
    private int COD_PRODUTO;
    
    
    //METODOS DE LA CLASE PROCUCTO

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public int getCOD_PRODUTO() {
        return COD_PRODUTO;
    }

    public void setCOD_PRODUTO(int COD_PRODUTO) {
        this.COD_PRODUTO = COD_PRODUTO;
    }

   
    
}
