package modelo;

import negocio.VehiculoInvalidoException;

public class Auto extends Vehiculo {
    private int cantidadPuertas;

    public Auto() {
        super();
    }

    public Auto(String marca, String modelo, int anio, String color, String tipoCarroceria, double precio, String condicion, int kilometraje, int cantidadPuertas) throws VehiculoInvalidoException {
        super(marca, modelo, anio, color, tipoCarroceria, precio, condicion, kilometraje);
        this.cantidadPuertas = cantidadPuertas;
    }

    public int getCantidadPuertas() { return cantidadPuertas; }
    public void setCantidadPuertas(int cantidadPuertas) { this.cantidadPuertas = cantidadPuertas; }
}