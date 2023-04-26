package orientadoBiblioB;

import java.util.ArrayList;

public class Bibliotecario extends Usuario {

        private String puestoTrabajo;
        private String nif;
        private String contrasena;
    
        public Bibliotecario() {
        }
    
        public Bibliotecario(String nombre, String apellido1, String apellido2, int edad, String telefono, String direccion, String codigoPostal, String correoElectronico, ArrayList<Reserva> reservas, String puestoTrabajo, String nif, String contrasena) {
            super(nombre, apellido1, apellido2, edad, telefono, direccion, codigoPostal, correoElectronico, reservas);
            this.puestoTrabajo = puestoTrabajo;
            this.nif = nif;
            this.contrasena = contrasena;
        }
    
        public Bibliotecario(Bibliotecario bibliotecario) {
            super(bibliotecario);
            this.puestoTrabajo = bibliotecario.puestoTrabajo;
            this.nif = bibliotecario.nif;
            this.contrasena = bibliotecario.contrasena;
        }
    
        public String getPuestoTrabajo() {
            return puestoTrabajo;
        }
    
        public void setPuestoTrabajo(String puestoTrabajo) {
            this.puestoTrabajo = puestoTrabajo;
        }
    
        public String getNif() {
            return nif;
        }
    
        public void setNif(String nif) {
            this.nif = nif;
        }
    
        public String getContrasena() {
            return contrasena;
        }
    
        public void setContrasena(String contrasena) {
            this.contrasena = contrasena;
        }
    
        @Override
        public String toString() {
            return "Bibliotecario [puestoTrabajo=" + puestoTrabajo + ", nif=" + nif + ", contrasena=" + contrasena + "]";
        }
    
}
