import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
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
        System.out.println("Ingrese el valor de la hora");
        ValorHora = sc.nextDouble();
        System.out.println("Ingrese la cantidad de las horas trabajadas");
        HorasTrabajadas = sc.nextDouble();
        
        SalarioBruto = HorasTrabajadas * ValorHora;
        if (SalarioBruto <= ValorSalarioMinimo * 2) {
            AuxilioTransporte = 200000;
        } else {
            AuxilioTransporte = 0;
            BonificacionEmpleado = 0;

        }
        DeduccionPension = 0.04 * SalarioBruto;
        DeduccionSalud = 0.04 * SalarioBruto;

        if (HorasTrabajadas > 96) {
            CantidadHorasExtras = HorasTrabajadas - 96;
            ValorExtra = ValorHora * 1.25;
            TotalValorHorasExtras = CantidadHorasExtras * ValorExtra;
            SalarioBruto = SalarioBruto + TotalValorHorasExtras;
        } else { 
            CantidadHorasExtras = 0;
            ValorExtra = 0;
            TotalValorHorasExtras = 0;
        }

        if (TotalValorHorasExtras < 24) {
            System.out.println("El empleado no ha trabajado lo suficiente para recibir salario");
        } else {
            SalarioNeto = SalarioBruto - (DeduccionPension + DeduccionSalud) + AuxilioTransporte + BonificacionEmpleado + ValorExtra;
            System.out.println("El salario bruto del empleado " + NombreEmpleado + " es: " + SalarioBruto);
            System.out.println("El salario neto del empleado " + NombreEmpleado + " es :" + SalarioNeto);
            System.out.println("El salario de la deducción de pensión es:" + DeduccionPension);
            System.out.println("El salario de la deducción pensión es:" + DeduccionSalud);
            System.out.println("El valor del auxilio de transporte es:" + AuxilioTransporte);
            System.out.println("El valor de la bonificación del empleado es" + BonificacionEmpleado);
            System.out.println("El valor de las horas extras es:" + TotalValorHorasExtras);
            
        }
    }
}
