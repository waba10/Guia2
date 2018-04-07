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
public class Proveedor {
    
    private String name, direccion;
    private int numero;
    Empresa empresa;
    
    public Proveedor(){
        
    }

    public Proveedor(String name, String direccion, int numero, Empresa empresa) {
        this.name = name;
        this.direccion = direccion;
        this.numero = numero;
        this.empresa = empresa;
    }

   



    public String getName() {
        return name;
    }

    public void setNombre(String name) {
        this.name = name;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
    
    
    
    
    
}
