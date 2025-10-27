public class AlarmasMatrix extends Accesorios{
    Car car;

    public AlarmasMatrix(Car car){
        this.car = car;
    }


    @Override
    public String getDescription() {
        return car.getDescription() + " , Alarmas matrix general con 2 controles";
    }

    @Override
    public int cost() {
        return car.cost() + 205000;
    }
    
}
