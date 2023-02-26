/* Los campos de la vacunación necesitan ser organizados para proporcionar la vacunación gratis a los niños por debajo de cinco años de la edad. Para organizar estos campos 
de vacunación, es necesaria realizar una encuesta a la población. Esta encuesta ayudará al personal del hospital a determinar el número aproximado de vacunas que deben ser provistas 
a los campos. Se darán vacunaciones gratis a los niños que están debajo de cinco años la edad, no tienen ninguna enfermedad, y nacen en familias por debajo de la línea de pobreza. 
Asumirán a las familias que tienen una renta anual menor de $4500 para estar debajo de la línea de la pobreza.
¿Qué técnica usted utilizará para representar el algoritmo para este problema? Dé un análisis razonado para su opción, y represente el algoritmo usando la técnica
seleccionada.*/

import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String args[]) {
    int edad = 0;
    boolean enfermedad = true;
    int ingreso = 0;
    
    
        System.out.println("Ingresa la edad:");   
        Scanner sc = new Scanner(System.in);
        String edadt = sc.nextLine();
        System.out.println("Ingreso:");
        String ingresot = sc.nextLine();
        System.out.println("Enfermedades:");
        String enfermedadt = sc.nextLine();
        
        //convierte a minusculas 
        enfermedadt = enfermedadt.toLowerCase();
        if (enfermedadt.equals("si")){
        enfermedad =false;  }
        else { 
        enfermedad = true;   
        } 

    if (edad <= 5 && ingreso <= 4500 && enfermedad == true) {
    System.out.println("Apto para vacuna");
    } else {
    System.out.println("No apto para vacuna");
        }
    }
}