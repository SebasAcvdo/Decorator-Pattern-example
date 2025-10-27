public class RinAluminio13 extends Accesorios{
    Car car;

    public RinAluminio13(Car car){
        this.car = car;
    }


    @Override
    public String getDescription() {
        return car.getDescription() + " , Rin aluminio de 13 pulgadas PICANTO";
    }

    @Override
    public int cost() {
        return car.cost() + 350000;
    }
    
}
