package orientadoBiblioB;

import java.sql.Date;


public class Reserva{

    private Libro libro;
    private Date Fecha_Hora;

    // Constructor vacío
    public Reserva(){

    }

    // Constructor con todos los parámetros
    public Reserva(Libro libro, Date Fecha_Hora){
        this.libro = libro;
        this.Fecha_Hora = Fecha_Hora;
    }

    // Constructor de copia
    public Reserva(Reserva reserva){
        this.libro = reserva.libro;
        this.Fecha_Hora = reserva.Fecha_Hora;
    }

    // Getters y setters
    public Libro getLibro(){
        return libro;
    }

    public void setLibro(Libro libro){
        this.libro = libro;
    }

    public Date getFecha_Hora(){
        return Fecha_Hora;
    }

    public void setFechaHora(Date Fecha_Hora){
        this.Fecha_Hora = Fecha_Hora;
    }

    // Método toString
    @Override
    public String toString(){
        return "Reserva [libro=" + libro + ", Fecha_Hora=" + Fecha_Hora + "]";
    }
    
}

