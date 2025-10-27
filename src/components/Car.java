package components;
public abstract class Car {
    String description = "Unkwnown car";

    public String getDescription(){
        return description;
    }

    public abstract int cost();
}