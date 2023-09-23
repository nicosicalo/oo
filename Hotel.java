package ejercicioHotel;

import java.time.LocalDate; // Importa LocalDate

public class Hotel {
    private Habitaciones habitaciones;
    private Clientes clientes;

    public Hotel(Habitaciones habitaciones, Clientes clientes) {
        this.setClientes(clientes);
        this.habitaciones = habitaciones;
    }

    public Habitaciones getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(Habitaciones habitaciones) {
        this.habitaciones = habitaciones;
    }

    public Clientes getClientes() {
        return clientes;
    }

    public void setClientes(Clientes clientes) {
        this.clientes = clientes;
    }

    public static class Reserva {
        private Clientes cliente;
        private Habitaciones habitacion;
        private LocalDate fechaDeComienzo; // Cambia Date a LocalDate
        private int cantDias;
        private float precio;
        private float seña;
        private estadoReserva estado;

        public Reserva(Clientes cliente, Habitaciones habitacion, LocalDate fechaDeComienzo,
                       int cantDias, float precio, float seña, estadoReserva estado) {
            this.seña = seña;
            this.cliente = cliente;
            this.habitacion = habitacion;
            this.fechaDeComienzo = fechaDeComienzo;
            this.cantDias = cantDias;
            this.precio = precio;
            this.estado = estado;
        }

        public Reserva(estadoReserva estado, Clientes cliente, Habitaciones habitacion,
                       LocalDate fechaDeComienzo, int cantDias, float precio) {
            this.cliente = cliente;
            this.habitacion = habitacion;
            this.fechaDeComienzo = fechaDeComienzo;
            this.cantDias = cantDias;
            this.precio = precio;
            this.estado = estado;
        }

        public enum estadoReserva {
            activa,
            señada,
            cumplida,
            tomada,
            vencida,
            cancelada;
        }

        public estadoReserva getEstado() {
            return estado;
        }

        public void setEstado(estadoReserva estado) {
            this.estado = estado;
        }

        public float getSeña() {
            return seña;
        }

        public void setSeña(float seña) {
            this.seña = seña;
        }

        public Clientes getCliente() {
            return cliente;
        }

        public void setCliente(Clientes cliente) {
            this.cliente = cliente;
        }

        public void setHabitacion(Habitaciones habitacion) {
            this.habitacion = habitacion;
        }

        public Habitaciones getHabitacion() {
            return habitacion;
        }

        public float getPrecio() {
            if (cliente.getTipoCliente() == tipoCliente.habitual) {
                return precio - 10;
            } else {
                return precio;
            }
        }

        public void setPrecio(float precio) {
            this.precio = precio;
        }

        public String getDescuento() {
            if (tipoCliente.habitual != null) {
                return "el descuento obtenido es de 10";
            } else {
                return "no hay descuento disponible";
            }
        }

        public LocalDate getFechaDeComienzo() { 
            return fechaDeComienzo;
        }

        public void setFechaDeComienzo(LocalDate fechaDeComienzo) { 
            this.fechaDeComienzo = fechaDeComienzo;
        }

        public int getCantDias() {
            return cantDias;
        }

        public void setCantDias(int cantDias) {
            this.cantDias = cantDias;
        }
    }

    public static class Clientes {
        private String nombre;
        private String Apellido;
        private tipoCliente Tipo;

        public Clientes(String nombre, String Apellido, tipoCliente Tipo) {
            this.Tipo = Tipo;
            this.Apellido = Apellido;
            this.nombre = nombre;
        }

        public tipoCliente getTipoCliente() {
            return Tipo;
        }

        public String getNombre() {
            return nombre;
        }

        public String getApellido() {
            return Apellido;
        }

        public void setTipoCliente(tipoCliente Tipo) {
            this.Tipo = Tipo;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public void setApellido(String Apellido) {
            this.Apellido = Apellido;
        }
    }

    public enum tipoCliente {
        habitual,
        esporadico;
    }

    public static class Habitaciones {
        private TipoHabitaciones tipoHabitacion;
        private estadoHabitaciones estado;
        private static float precio;
        private int piso;
        private int numero;

        public Habitaciones(int numero, int piso, float precio, estadoHabitaciones estado, TipoHabitaciones tipoHabitacion) {
            this.tipoHabitacion = tipoHabitacion;
            Habitaciones.precio = precio;
            this.piso = piso;
            this.estado = estado;
            this.numero = numero;
        }

        public estadoHabitaciones getEstado() {
            return estado;
        }

        public TipoHabitaciones getTipoHabitaciones() {
            return tipoHabitacion;
        }

        public static float getPrecio() {
            return precio;
        }

        public int getPiso() {
            return piso;
        }

        public int getNumero() {
            return numero;
        }

        public void setEstado(estadoHabitaciones estado) {
            this.estado = estado;
        }

        public void setTipohabitacion(TipoHabitaciones tipoHabitacion) {
            this.tipoHabitacion = tipoHabitacion;
        }

        public void setNumero(int numero) {
            this.numero = numero;
        }

        public void setPiso(int piso) {
            this.piso = piso;
        }

        public void setPrecio(float precio) {
            Habitaciones.precio = precio;
        }
    }

    public enum TipoHabitaciones {
        simple,
        doble,
        matrimonial;
    }

    public enum estadoHabitaciones {
        ocupada,
        libre,
    }
}
