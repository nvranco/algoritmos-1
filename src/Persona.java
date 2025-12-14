public class Persona {

    // --- Atributos (Variables de instancia) ---
    // Se usan 'private' para proteger los datos (Encapsulamiento)
    private String nombre;
    private String genero;
    private int edad;

    // --- Constructor Vacío ---
    // Útil si quieres crear la persona y llenar los datos después
    public Persona() {
    }

    // --- Constructor con Argumentos ---
    // Para crear la persona con todos sus datos de una vez
    public Persona(String nombre, String genero, int edad) {
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
    }

    // --- Métodos Getters y Setters ---
    // Permiten leer (get) y modificar (set) los valores

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        // Ejemplo de validación: no permitir edades negativas
        if (edad >= 0) {
            this.edad = edad;
        } else {
            System.out.println("La edad no puede ser negativa.");
        }
    }

    // --- Método toString ---
    // Convierte el objeto a texto para imprimirlo fácilmente
    @Override
    public String toString() {
        return "Persona [Nombre=" + nombre + ", Género=" + genero + ", Edad=" + edad + "]";
    }
}