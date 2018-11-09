package com.asforsoft.nats.firebaseapp.model;

public class Product {

    private String id;
    private String nombre;
    private String descripcion;
    private String precioCompra;
    private String precioVentaBase;
    private String gananciaMinima;
    private String cantidad;

    public Product() {
    }

    public Product(String id, String nombre, String descripcion, String precioCompra, String precioVentaBase, String gananciaMinima, String cantidad) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precioCompra = precioCompra;
        this.precioVentaBase = precioVentaBase;
        this.gananciaMinima = gananciaMinima;
        this.cantidad = cantidad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(String precioCompra) {
        this.precioCompra = precioCompra;
    }

    public String getPrecioVentaBase() {
        return precioVentaBase;
    }

    public void setPrecioVentaBase(String precioVentaBase) {
        this.precioVentaBase = precioVentaBase;
    }

    public String getGananciaMinima() {
        return gananciaMinima;
    }

    public void setGananciaMinima(String gananciaMinima) {
        this.gananciaMinima = gananciaMinima;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", precioCompra='" + precioCompra + '\'' +
                ", precioVentaBase='" + precioVentaBase + '\'' +
                ", gananciaMinima='" + gananciaMinima + '\'' +
                ", cantidad='" + cantidad + '\'' +
                '}';
    }
}
