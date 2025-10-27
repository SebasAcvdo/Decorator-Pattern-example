package decorators;
import components.Car;

public class SensorParqueo extends Accesorios{
    Car car;

    public SensorParqueo(Car car){
        this.car = car;
    }


    @Override
    public String getDescription() {
        return car.getDescription() + " , Sensor de parqueo";
    }

    @Override
    public int cost() {
        return car.cost() + 150000;
    }
    
}
