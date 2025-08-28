public class StudentModel {
    private String nombre;
    private int edad;
    private String carrera;   // nuevo atributo
    private double promedio;  // nuevo atributo

    // Constructor principal
    public StudentModel(String nombre, int edad, String carrera, double promedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
        this.promedio = promedio;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad > 0) {   // validación
            this.edad = edad;
        } else {
            System.out.println("La edad no puede ser negativa.");
        }
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        if (promedio >= 0 && promedio <= 20) {  // escala de 0 a 20 (ejemplo Perú)
            this.promedio = promedio;
        } else {
            System.out.println("El promedio debe estar entre 0 y 20.");
        }
    }

    // Método para mostrar información
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + 
                           ", Edad: " + edad + 
                           ", Carrera: " + carrera + 
                           ", Promedio: " + promedio);
    }

    // Método para verificar si aprueba
    public boolean aprobo() {
        return promedio >= 11;
    }
}
