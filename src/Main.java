
class Vehiculo {
    void acelerar() {
    }
    void frenar() {
    }
    
}
class Carro extends Vehiculo {
}

class Bicicleta extends Vehiculo {
}

class creacionVehiculo {
    public Vehiculo crearVehiculo(String tipo) {
        if (tipo.equalsIgnoreCase("Carro")) {
            return new Carro();
        } else if (tipo.equalsIgnoreCase("Bicicleta")) {
            return new Bicicleta();
        } else {
            throw new IllegalArgumentException("Tipo de vehículo no válido");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        creacionVehiculo factoria = new creacionVehiculo();

        Vehiculo vehiculo1 = factoria.crearVehiculo("Carro");
        vehiculo1.acelerar();

        Vehiculo vehiculo2 = factoria.crearVehiculo("Bicicleta");
        vehiculo2.frenar();
    }
}
