
package ec.edu.intsuperior.controlador;

import ec.edu.intsuperior.modelo.Parqueadero;
import ec.edu.intsuperior.modelo.Vehiculo;
/**
 *
 * @author 59398
 */
public class Ticket {
    
    private String idTicket;
    private Parqueadero parqueadero; 
    private Vehiculo vehiculo;
    private String fechaIngreso;
    private String fechaSalida;

    public Ticket() {
    }

    public Ticket(String idTicket, Parqueadero parqueadero, Vehiculo vehiculo, String fechaIngreso, String fechaSalida) {
        this.idTicket = idTicket;
        this.parqueadero = parqueadero;
        this.vehiculo = vehiculo;
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getIdTicket() {
        return idTicket;
    }

    public void setIdTicket(String idTicket) {
        this.idTicket = idTicket;
    }

    public Parqueadero getParqueadero() {
        return parqueadero;
    }

    public void setParqueadero(Parqueadero parqueadero) {
        this.parqueadero = parqueadero;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
    
    
}
