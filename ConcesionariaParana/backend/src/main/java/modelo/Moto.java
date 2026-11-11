package modelo;

import negocio.VehiculoInvalidoException;

public class Moto extends Vehiculo {
    private int cilindrada;

    public Moto() {
        super();
    }

    public Moto(String marca, String modelo, int anio, String color, String tipoCarroceria, double precio, String condicion, int kilometraje, int cilindrada) throws VehiculoInvalidoException {
        super(marca, modelo, anio, color, tipoCarroceria, precio, condicion, kilometraje);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() { return cilindrada; }
    public void setCilindrada(int cilindrada) { this.cilindrada = cilindrada; }
}