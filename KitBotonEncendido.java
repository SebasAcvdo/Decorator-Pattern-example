public class KitBotonEncendido extends Accesorios{
    Car car;

    public KitBotonEncendido(Car car){
        this.car = car;
    }


    @Override
    public String getDescription() {
        return car.getDescription() + " , Kit de botón de encendido con alarma y 2 controles tipo disparador";
    }

    @Override
    public int cost() {
        return car.cost() + 1500000;
    }
    
}
