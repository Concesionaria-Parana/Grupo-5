package negocio;

import modelo.Vehiculo;
import modelo.Auto;
import modelo.Moto;
import java.util.ArrayList;
import java.util.List;

public class GestorConcesionaria {
    private List<Vehiculo> listaVehiculos;

    public GestorConcesionaria() {
        this.listaVehiculos = new ArrayList<>();
        cargarVehiculosDePrueba();
    }

    public void agregarVehiculo(Vehiculo v) {
        listaVehiculos.add(v);
    }

    public List<Vehiculo> obtenerVehiculos() {
        return listaVehiculos;
    }

    private void cargarVehiculosDePrueba() {
        try {
            // Se pasan los valores ordenados por comas y manejando la excepción del constructor
            listaVehiculos.add(new Auto("Toyota", "Corolla", 2023, "Blanco", "Sedán", 25000.0, "0 km", 0, 4));
            listaVehiculos.add(new Moto("Yamaha", "MT-03", 2022, "Negro", "Naked", 6500.0, "Usado", 4500, 321));
        } catch (VehiculoInvalidoException e) {
            System.err.println("Error al cargar los vehículos de prueba: " + e.getMessage());
        }
    }
}
