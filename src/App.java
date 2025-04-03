import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in)
        String NombreEmpleado = "";
        String DocumentoEmpleado = "";
        String DiaDescanso = "";
        double SalarioBruto = 0;
        double SalarioNeto = 0;
        double DeduccionPension = 0;
        double DeduccionSalud = 0;
        double HorasTrabajadas = 0;
        double ValorHora = 0;
        double BonificacionEmpleado = 0;
        double ValorSalarioMinimo = 1423500;
        double AuxilioTransporte = 200000;
        double ValorExtra = 0;
        double CantidadHorasExtras = 0;
        double TotalValorHorasExtras = 0;

        System.out.println("Ingrese el nombre del empleado");
        NombreEmpleado = sc.nextLine();
        System.out.println("Ingrese el documento del empleado");
        DocumentoEmpleado = sc.nextLine();
        System.out.println("Ingrese el día de descanso (solamente de lunes a viernes)");
        DiaDescanso = sc.nextLine();
    }
}
