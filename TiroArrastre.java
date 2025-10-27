public class TiroArrastre extends Accesorios{
    Car car;

    public TiroArrastre(Car car){
        this.car = car;
    }


    @Override
    public String getDescription() {
        return car.getDescription() + " , Tiro de arrastre";
    }

    @Override
    public int cost() {
        return car.cost() + 810000;
    }
    
}
