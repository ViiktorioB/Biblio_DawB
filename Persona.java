package orientadoBiblioB;

import java.util.Scanner;

public class Persona {
  
    private String nombre;
    private String apellido1;
    private String apellido2;
    private int edad;

    public Persona(){

    }

    public Persona(String nombre, String apellido1, String apellido2, int edad){
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.edad = edad;
    }

    public Persona(Persona persona){
        this.nombre = persona.nombre;
        this.apellido1 = persona.apellido1;
        this.apellido2 = persona.apellido2;
        this.edad = persona.edad;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getApellido1(){
        return apellido1;
    }

    public void setApellido1(String apellido1){
        this.apellido1 = apellido1;
    }

    public String getApellido2(){
        return apellido2;
    }

    public void setApellido2(String apellido2){
        this.apellido2 = apellido2;
    }

    public int getEdad(){
        return edad;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", edad=" + edad
                + "]";
    }

    public void solicitarDatosPersona() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre: ");
        this.nombre = scanner.nextLine();

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el apellido: ");
        this.apellido1 = sc.nextLine();

        Scanner sc_edad = new Scanner(System.in);
        System.out.print("Ingrese la edad: ");
        this.edad = scanner.nextInt();
    }
    
}

