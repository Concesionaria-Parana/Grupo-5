package modelo;
import negocio.VehiculoInvalidoException;

public abstract class Vehiculo {
    private String marca;
    private String modelo;
    private int anio;
    private String color;
    private String tipoCarroceria;
    private double precio;
    private String condicion; // "0 km" o "Usado"
    private int kilometraje;

    public Vehiculo() {}

    public Vehiculo(String marca, String modelo, int anio, String color, String tipoCarroceria, double precio, String condicion, int kilometraje) throws VehiculoInvalidoException {
        setPrecio(precio);
        setKilometraje(kilometraje);
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.color = color;
        this.tipoCarroceria = tipoCarroceria;
        this.condicion = condicion;
    }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public int getAnio() { return anio; }
    public void setAnio(int anio) { this.anio = anio; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public String getTipoCarroceria() { return tipoCarroceria; }
    public void setTipoCarroceria(String tipoCarroceria) { this.tipoCarroceria = tipoCarroceria; }

    public double getPrecio() { return precio; }
    
    // Validación de precio no negativo
    public void setPrecio(double precio) throws VehiculoInvalidoException {
        if (precio < 0) {
            throw new VehiculoInvalidoException("Error: El precio del vehículo no puede ser negativo.");
        }
        this.precio = precio;
    }

    public String getCondicion() { return condicion; }
    public void setCondicion(String condicion) { this.condicion = condicion; }

    public int getKilometraje() { return kilometraje; }
    
    // Validación de kilometraje no negativo
    public void setKilometraje(int kilometraje) throws VehiculoInvalidoException {
        if (kilometraje < 0) {
            throw new VehiculoInvalidoException("Error: El kilometraje no puede ser negativo.");
        }
        this.kilometraje = kilometraje;
    }
}