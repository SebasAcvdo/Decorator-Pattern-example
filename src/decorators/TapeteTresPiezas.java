package decorators;
import components.Car;

public class TapeteTresPiezas extends Accesorios{
    Car car;

    public TapeteTresPiezas(Car car){
        this.car = car;
    }


    @Override
    public String getDescription() {
        return car.getDescription() + " , Tapete de tres piezas alfombra PICANTO";
    }

    @Override
    public int cost() {
        return car.cost() + 92000;
    }
    
}
