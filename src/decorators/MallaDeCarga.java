package decorators;
import components.Car;

public class MallaDeCarga extends Accesorios{
    Car car;

    public MallaDeCarga(Car car){
        this.car = car;
    }


    @Override
    public String getDescription() {
        return car.getDescription() + " , Malla de carga";
    }

    @Override
    public int cost() {
        return car.cost() + 110000;
    }
    
}
