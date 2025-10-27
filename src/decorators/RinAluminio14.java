package decorators;
import components.Car;

public class RinAluminio14 extends Accesorios{
    Car car;
    tiporin tipo;

    public enum tiporin{
        Diseño1(" , Rin aluminio de 14 pulgadas negro mecanizado PICANTO"), 
        Diseño2(" , Rin aluminio de 14 pulgadas negro mecanizado PICANTO con un diseño alterno"),
        Diseño3(" , Rin aluminio de 14 pulgadas gris mecanizado PICANTO");

        public String descripcion;

        tiporin(String descripcion) {
            this.descripcion = descripcion;
        }
    }

    public RinAluminio14(Car car, tiporin tipo){
        this.car = car;
        this.tipo = tipo;
    }

    public RinAluminio14(Car car){
        this(car, tiporin.Diseño1);
    }

    @Override
    public String getDescription() {
        return car.getDescription() + tipo.descripcion;
    }

    @Override
    public int cost() {
        return car.cost() + 350000;
    }
}
