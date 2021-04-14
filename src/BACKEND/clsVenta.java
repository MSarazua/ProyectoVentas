/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BACKEND;

/**
 *
 * @author MSarazua
 */
public class clsVenta {

    public clsVenta() {
    }
    
    //Atributos
    private int FACTURA;
    private String FECHA;
    private String NIT;
    private String NOMBRE;
    private String DIRECCION;
    private int MONTO_TOTAL;
    private int CANTIDAD_PRODUCTOS;
    private String ESTATUS;
    
    //Contructor

    public clsVenta(int FACTURA, String FECHA, String NIT, String NOMBRE, String DIRECCION, int MONTO_TOTAL, int CANTIDAD_PRODUCTOS, String ESTATUS) {
        this.FACTURA = FACTURA;
        this.FECHA = FECHA;
        this.NIT = NIT;
        this.NOMBRE = NOMBRE;
        this.DIRECCION = DIRECCION;
        this.MONTO_TOTAL = MONTO_TOTAL;
        this.CANTIDAD_PRODUCTOS = CANTIDAD_PRODUCTOS;
        this.ESTATUS = ESTATUS;
    }
    
    
    //Métodos
    public int getFACTURA() {
        return FACTURA;
    }

    public void setFACTURA(int FACTURA) {
        this.FACTURA = FACTURA;
    }

    public String getFECHA() {
        return FECHA;
    }

    public void setFECHA(String FECHA) {
        this.FECHA = FECHA;
    }

    public String getNIT() {
        return NIT;
    }

    public void setNIT(String NIT) {
        this.NIT = NIT;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public void setNOMBRE(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }

    public String getDIRECCION() {
        return DIRECCION;
    }

    public void setDIRECCION(String DIRECCION) {
        this.DIRECCION = DIRECCION;
    }

    public int getMONTO_TOTAL() {
        return MONTO_TOTAL;
    }

    public void setMONTO_TOTAL(int MONTO_TOTAL) {
        this.MONTO_TOTAL = MONTO_TOTAL;
    }

    public int getCANTIDAD_PRODUCTOS() {
        return CANTIDAD_PRODUCTOS;
    }

    public void setCANTIDAD_PRODUCTOS(int CANTIDAD_PRODUCTOS) {
        this.CANTIDAD_PRODUCTOS = CANTIDAD_PRODUCTOS;
    }

    public String getESTATUS() {
        return ESTATUS;
    }

    public void setESTATUS(String ESTATUS) {
        this.ESTATUS = ESTATUS;
    }
}
