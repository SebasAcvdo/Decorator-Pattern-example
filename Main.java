public class Main{
    public static void main(String[] args) {

        Car car = new GTLineAT();

        car = new PernosDeSeguridad(car);
        car = new MallaDeCarga(car);
        car = new Portabicicletas(car);
        car = new RinAluminio13(car);
        car = new SensorParqueo(car);
        car = new TapeteTresPiezas(car);

        System.out.println(car.getDescription() + " $ " + car.cost()  );

    }


}