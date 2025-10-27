package app;
import components.Car;
import components.GTLineAT;
import components.ZenithAT;
import decorators.MallaDeCarga;
import decorators.PernosDeSeguridad;
import decorators.Portabicicletas;
import decorators.RinAluminio13;
import decorators.SensorParqueo;
import decorators.TapeteTresPiezas;

public class Main {
    public static void main(String[] args) {

        Car car = new GTLineAT();
        System.out.println("1. Auto base:");
        System.out.println(car.getDescription());
        System.out.println("Precio: $" + car.cost() + "\n");

        car = new PernosDeSeguridad(car);
        car = new MallaDeCarga(car);
        car = new Portabicicletas(car);
        car = new RinAluminio13(car);
        car = new SensorParqueo(car);
        car = new TapeteTresPiezas(car);

        System.out.println("2. Auto con accesorios:");
        System.out.println(car.getDescription());
        System.out.println("Precio total: $" + car.cost() + "\n");

        // Otro modelo.

        System.out.println("Prueba con otro vehiculo" + "\n");
        Car car1 = new ZenithAT();
        System.out.println("1. Auto base:");
        System.out.println(car1.getDescription());
        System.out.println("Precio: $" + car1.cost() + "\n");

        car1 = new PernosDeSeguridad(car1);
        car1 = new MallaDeCarga(car1);
        car1 = new Portabicicletas(car1);

        System.out.println("2. Auto con accesorios:");
        System.out.println(car1.getDescription());
        System.out.println("Precio total: $" + car1.cost());
    }

}