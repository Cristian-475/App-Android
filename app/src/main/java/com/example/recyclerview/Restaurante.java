package com.example.recyclerview;

public class Restaurante {
    private String Sucursal, Info;
    private int Imagen;

    public Restaurante() {
    }

    public Restaurante(String sucursal, String info, int imagen) {
        this.Sucursal = sucursal;
        this.Info = info;
        this.Imagen=imagen;
    }

    public String getSucursal() {
        return Sucursal;
    }

    public void setSucursal(String sucursal) {
        this.Sucursal = sucursal;
    }

    public String getInfo() {
        return Info;
    }

    public void setInfo(String info) {
        this.Info = info;
    }

    public int getImagen() {
        return Imagen;
    }

    public void setImagen(int imagen) {
        this.Imagen = imagen;
    }
}
