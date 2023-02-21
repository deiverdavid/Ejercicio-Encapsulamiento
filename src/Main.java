public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona();

        persona1.setEdad(15);
        persona1.setNombre("Alfredo");
        persona1.setTelefono("+573113070585");

        System.out.println(persona1.getNombre() + " tiene " + persona1.getEdad() + " años"+ " y su número celular es: " + persona1.getTelefono());
    }
}