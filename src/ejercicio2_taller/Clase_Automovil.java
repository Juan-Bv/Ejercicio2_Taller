
package ejercicio2_taller;


public class Clase_Automovil {
    
    private String marcaAuto; // Creé esta variable para almacenar la marca del automóvil
    private int modeloAuto; // Creé esta variable para almacenar el modelo del automóvil
    private int tipoMotor; // Creé esta variable para almacenar el tipo de motor
    private String tipoCombustible; // Creé esta variable para almacenar el tipo de combustible (por ejemplo, gasolina o diésel)
    private String categoriaAuto; // Creé esta variable para almacenar el tipo de automóvil (por ejemplo, sedán, SUV)
    private int puertasAuto; // Creé esta variable para almacenar el número de puertas del automóvil
    private int asientosAuto; // Creé esta variable para almacenar la cantidad de asientos
    private int velocidadMaxima; // Creé esta variable para almacenar la velocidad máxima que puede alcanzar el automóvil
    private String colorAuto; // Creé esta variable para almacenar el color del automóvil
    private int velocidadActual; // Creé esta variable para almacenar la velocidad actual del automóvil

    // Cree un constructor que inicializa los atributos respecto al automóvil
    public Clase_Automovil(String marcaAuto, int modeloAuto, int tipoMotor, String tipoCombustible, String categoriaAuto, int puertasAuto, int asientosAuto, int velocidadMaxima, String colorAuto) {
        this.marcaAuto = marcaAuto; // Asigné la marca del automóvil
        this.modeloAuto = modeloAuto; // Asigné el modelo del automóvil
        this.tipoMotor = tipoMotor; // Asigné el tipo de motor
        this.tipoCombustible = tipoCombustible; // Asigné el tipo de combustible
        this.categoriaAuto = categoriaAuto; // Asigné el tipo de automóvil
        this.puertasAuto = puertasAuto; // Asigné el número de puertas
        this.asientosAuto = asientosAuto; // Asigné la cantidad de asientos
        this.velocidadMaxima = velocidadMaxima; // Asigné la velocidad máxima del automóvil
        this.colorAuto = colorAuto; // Asigné el color del automóvil
        this.velocidadActual = 0; // Inicialicé la velocidad actual en 0, ya que el auto está detenido al comienzo
    }

    // Cree un método que acelera el automóvil aumentando la velocidad actual
    public void acelerar(int incrementoVelocidad) {
        /*
           Profesor, en este método, primero verifiqué que al incrementar la velocidad actual
           no se exceda la velocidad máxima del automóvil. Si es así, aumenté la velocidad actual;
           de lo contrario, mostré un mensaje indicando que no se puede superar la velocidad máxima.
        */
        if (velocidadActual + incrementoVelocidad <= velocidadMaxima) {
            velocidadActual += incrementoVelocidad; // Aumenté la velocidad actual con el incremento dado
            System.out.println("Velocidad actual = " + velocidadActual); // Imprimí la velocidad actual
        } else {
            System.out.println("No se puede superar la velocidad máxima."); // Mostré un mensaje si la velocidad máxima es superada
        }
    }

    // Método que frena el automóvil disminuyendo la velocidad actual
    public void frenar(int decrementoVelocidad) {
        /*
           Profesor, en este método verifiqué que al disminuir la velocidad actual no se haga negativa.
           Si al restar el decremento la velocidad sigue positiva, actualicé la velocidad.
           En caso contrario, mostré la velocidad como 0 y un mensaje indicando que no se puede ir a una velocidad negativa.
        */
        if (velocidadActual - decrementoVelocidad >= 0) {
            velocidadActual -= decrementoVelocidad; // Reduje la velocidad actual con el decremento dado
            System.out.println("Velocidad actual = " + velocidadActual); // Imprimí la velocidad actual
        } else {
            System.out.println("Velocidad actual = 0"); // Mostré que la velocidad no puede ser negativa
            System.out.println("No se puede decrementar a una velocidad negativa."); // Indiqué que no se puede tener velocidad negativa
            velocidadActual = 0; // Establecí la velocidad en 0 para evitar valores negativos
        }
    }

    // Método que imprime todos los atributos del automóvil
    public void mostrarAtributos() {
        /*
           Profesor, en este método imprimí cada uno de los atributos del automóvil.
           Incluí la marca, modelo, tipo de motor, tipo de combustible, tipo de automóvil,
           número de puertas, cantidad de asientos, velocidad máxima y el color del automóvil.
           Esto permite tener una descripción completa del auto.
        */
        System.out.println("Marca = " + marcaAuto); // Imprimí la marca del automóvil
        System.out.println("Modelo = " + modeloAuto); // Imprimí el modelo del automóvil
        System.out.println("Motor = " + tipoMotor); // Imprimí el tipo de motor
        System.out.println("Tipo de combustible = " + tipoCombustible); // Imprimí el tipo de combustible
        System.out.println("Tipo de automóvil = " + categoriaAuto); // Imprimí el tipo de automóvil
        System.out.println("Número de puertas = " + puertasAuto); // Imprimí el número de puertas
        System.out.println("Cantidad de asientos = " + asientosAuto); // Imprimí la cantidad de asientos
        System.out.println("Velocidad máxima = " + velocidadMaxima); // Imprimí la velocidad máxima
        System.out.println("Color = " + colorAuto); // Imprimí el color del automóvil
    }

    
}