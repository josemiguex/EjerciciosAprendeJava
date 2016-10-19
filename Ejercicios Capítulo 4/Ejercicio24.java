/* Ejercicio 24 - Capítulo 4
 * Escribe un programa que genere la nómina (bien desglosada) de un empleado
 * según las siguientes condiciones:
 * • Se pregunta el cargo del empleado (1 - Prog. junior, 2 - Prog. senior, 3
 * - Jefe de proyecto), los días que ha estado de viaje visitando clientes
 * durante el mes y su estado civil (1 - Soltero, 2 - Casado).
 * • El sueldo base según el cargo es de 950, 1200 y 1600 euros según
 * si se trata de un prog. junior, un prog. senior o un jefe de proyecto
 * respectivamente.
 * • Por cada día de viaje visitando clientes se pagan 30 euros extra en
 * concepto de dietas. Al sueldo neto hay que restarle el IRPF, que será
 * de un 25% en caso de estar soltero y un 20% en caso de estar casado.
 * Hecho por Jose Miguel Martín Hidalgo
 */
 
 public class Ejercicio24 {
   public static void main(String[] args) {
  
     System.out.println("Generador de la nómina de un empleado");
     System.out.println("----------------------");
     System.out.println("¿Cuál es el cargo del empleado? (Escribe la letra)");
     System.out.println("a - Prog. junior");
     System.out.println("b - Prog. senior");
     System.out.println("c - Jefe de proyecto");
     String opcion = System.console().readLine();
     
     double sueldoBase;
     
     switch(opcion) {
       case "a":
        sueldoBase = 950;
        break;
       case "b":
        sueldoBase = 1200;
        break;
       case "c":
        sueldoBase = 1600;
        break;
       default:
        System.out.println("Opción inválida");
        sueldoBase = 0;
      }
     
     System.out.print("¿Cuantos días ha estado de viaje el empleado visitando clientes durante el mes?: ");
     int diasViaje = Integer.parseInt(System.console().readLine());
     
     System.out.println("¿Estado civil? (Escribe la letra)");
     System.out.println("a) Soltero");
     System.out.println("b) Casado");
     String estadoCivil = System.console().readLine();
     
     double IRPF;
     
     switch(estadoCivil) {
       case "a":
        IRPF = 0.25;
        break;
       case "b":
        IRPF = 0.20;
        break;
       default: 
        System.out.print("Opción Inválida");
        IRPF = 0;
      }
      
      if (IRPF == 0 || sueldoBase == 0) {
        System.out.print("Imposible calcular la nómina ya que antes elegiste una opción inválida");
      } else {
        
        double sueldoBruto = sueldoBase + 30 * diasViaje;
        
        
        System.out.println("Sueldo base: " + sueldoBase);
        System.out.println("-----------------------------------");
        System.out.println("Dietas (" + diasViaje + " viajes): " + 30 * diasViaje);
        System.out.println("Sueldo bruto: " + (sueldoBruto));
        System.out.println("-----------------------------------");
        System.out.println("IRPF: " + (sueldoBruto * IRPF));
        System.out.println("Sueldo neto: " + (sueldoBruto - (sueldoBruto * IRPF))); 
      }
     
     
     
   }
 }
 
