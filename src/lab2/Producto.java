/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author busti
 */
public class Producto {
    
    private String producto;
    private int cantidad;
    private float costo;
    
    public Producto(){
        
    }

    public Producto(String producto, int cantidad, float costo) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.costo = costo;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }
    
    
    
}
