package orientadoBiblioB;

    import java.util.ArrayList;
import java.util.Scanner;

public class Usuario extends Persona {

   
    private String telefono;
    private String direccion;
    private String codigoPostal;
    private String correoElectronico;
    private ArrayList<Reserva> reservas;

    public Usuario() {
    }

    public Usuario(String nombre, String apellido1, String apellido2, int edad, String telefono, String direccion,String codigoPostal, String correoElectronico, ArrayList<Reserva> reservas) {
        super(nombre, apellido1, apellido2, edad);
        this.telefono = telefono;
        this.direccion = direccion;
        this.codigoPostal = codigoPostal;
        this.correoElectronico = correoElectronico;
        this.reservas = reservas;
    }

    public Usuario(Usuario usuario) {
        super(usuario);
        this.telefono = usuario.telefono;
        this.direccion = usuario.direccion;
        this.codigoPostal = usuario.codigoPostal;
        this.correoElectronico = usuario.correoElectronico;
        this.reservas = new ArrayList<>(usuario.reservas);
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public ArrayList<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(ArrayList<Reserva> reservas) {
        this.reservas = reservas;
    }

    @Override
    public String toString() {
        return "Usuario [nombre "+ getNombre() +" apellidos "+ getApellido1()+ " "+ getApellido2() +" telefono=" + telefono + ", direccion=" + direccion + ", codigoPostal=" + codigoPostal
                + ", correoElectronico=" + correoElectronico + ", reservas=" + reservas + "]";
    }

    @Override
    public void solicitarDatosPersona() {
        super.solicitarDatosPersona();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Telefono?: ");
        this.telefono = scanner.nextLine();

        Scanner direeccion = new Scanner(System.in);
        System.out.print("Direccion?: ");
        this.direccion = direeccion.nextLine();

        Scanner correo = new Scanner(System.in);
        System.out.print("Correo?: ");
        this.correoElectronico = correo.nextLine();

        Scanner cp = new Scanner(System.in);
        System.out.print("Codigo Postal?: ");
        this.codigoPostal = cp.nextLine();
    }

}
