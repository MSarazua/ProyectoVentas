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
public class clsDetalle {
    private int FACTURA;
    private int COD_PRODUTO;
    private int CANTIDAD;
    private double PRECIO;
    private int ID;

    public clsDetalle() {
    }

    public clsDetalle(int FACTURA, int COD_PRODUTO, int CANTIDAD, double PRECIO, int ID) {
        this.FACTURA = FACTURA;
        this.COD_PRODUTO = COD_PRODUTO;
        this.CANTIDAD = CANTIDAD;
        this.PRECIO = PRECIO;
        this.ID = ID;
    }

    public int getFACTURA() {
        return FACTURA;
    }

    public void setFACTURA(int FACTURA) {
        this.FACTURA = FACTURA;
    }

    public int getCANTIDAD() {
        return CANTIDAD;
    }

    public void setCANTIDAD(int CANTIDAD) {
        this.CANTIDAD = CANTIDAD;
    }

    public double getPRECIO() {
        return PRECIO;
    }

    public void setPRECIO(double PRECIO) {
        this.PRECIO = PRECIO;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getCOD_PRODUTO() {
        return COD_PRODUTO;
    }

    public void setCOD_PRODUTO(int COD_PRODUTO) {
        this.COD_PRODUTO = COD_PRODUTO;
    }
    
    
}
