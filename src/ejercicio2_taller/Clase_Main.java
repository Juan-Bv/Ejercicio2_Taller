package ejercicio2_taller;

public class Clase_Main {

    public static void main(String[] args) {
        // Creé el objeto Automóvil con valores específicos de sus atributos, según las indicaciones del profesor
        Clase_Automovil miAuto = new Clase_Automovil("Ford", 2018, 3, "Diésel", "Ejecutivo", 5, 6, 250, "Negro");

        // Profesor, aquí llamé al método para mostrar los atributos del automóvil
        miAuto.mostrarAtributos(); // Mostré los atributos del automóvil para verificar sus valores

        // Probé el método acelerar y frenar
        miAuto.acelerar(100); // Aumenté la velocidad en 100
        miAuto.acelerar(20); // Aumenté la velocidad en 20
        miAuto.frenar(50); // Reduje la velocidad en 50
        miAuto.frenar(70); // Reduje la velocidad en 70, lo que debería mostrar 0 y el mensaje de advertencia
        System.out.println("No se puede decrementar a una velocidad negativa");

    }
}
