public class Portabicicletas extends Accesorios{
    Car car;

    public Portabicicletas(Car car){
        this.car = car;
    }


    @Override
    public String getDescription() {
        return car.getDescription() + " , Portabicicletas X2 puestos";
    }

    @Override
    public int cost() {
        return car.cost() + 910000;
    }
    
}

