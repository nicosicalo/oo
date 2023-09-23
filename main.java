package ejercicioHotel;


import java.time.LocalDate;



import ejercicioHotel.Hotel.Habitaciones;
import ejercicioHotel.Hotel.Reserva;

public class main {

	public static void main(String[] args) {
		Hotel.Habitaciones habitacion1= new Hotel.Habitaciones(12, 3, 100, Hotel.estadoHabitaciones.libre,Hotel.TipoHabitaciones.matrimonial);
		Hotel.Habitaciones habitacion2= new Hotel.Habitaciones(10, 1, 70, Hotel.estadoHabitaciones.libre,Hotel.TipoHabitaciones.doble);
		Hotel.Habitaciones habitacion3= new Hotel.Habitaciones(10, 2, 50, Hotel.estadoHabitaciones.libre,Hotel.TipoHabitaciones.simple);
		Hotel.Clientes cliente1= new Hotel.Clientes("nicolas", "sicalo", Hotel.tipoCliente.habitual);
		Hotel.Reserva reserva1= new Hotel.Reserva(Reserva.estadoReserva.tomada, cliente1, habitacion1,LocalDate.of(2024, 3, 12), 7,Habitaciones.getPrecio());
		habitacion1.setEstado(Hotel.estadoHabitaciones.ocupada);
		System.out.println(habitacion2.getEstado());
		System.out.println(reserva1.getDescuento());
		System.out.println(reserva1.getPrecio());
		reserva1.setEstado(Reserva.estadoReserva.cancelada);
		habitacion1.setEstado(Hotel.estadoHabitaciones.libre);
		
	}

}
