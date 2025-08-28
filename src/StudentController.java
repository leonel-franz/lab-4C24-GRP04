public class StudentController {
    public static void main(String[] args) {
        System.out.println("Bienvenido al sistema de estudiantes.");
        System.out.println("Cargando datos del estudiante...");

        StudentReport reporte = new StudentReport();
        reporte.generarReporte();

        System.out.println("Sistema finalizado correctamente.");
    }
}
