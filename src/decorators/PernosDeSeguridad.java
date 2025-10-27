package decorators;
import components.Car;

public class PernosDeSeguridad extends Accesorios{
    Car car;

    public PernosDeSeguridad(Car car){
        this.car = car;
    }


    @Override
    public String getDescription() {
        return car.getDescription() + " , Pernos de seguridad Starlock";
    }

    @Override
    public int cost() {
        return car.cost() + 156100;
    }
    
}
