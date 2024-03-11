public class Flax extends Flower{

    public Flax(String name, double price, double neededArea, double chanceOfGrowth, boolean) {
    }

    public void seed(){
        Flax flax = new Flax("Flax", 120, 1, );
    }

    @Override
    public String toString() {
        return "Flax{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", neededArea=" + neededArea +
                ", chanceOfGrowth=" + chanceOfGrowth +
                ", grown=" + grown +
                '}';
    }
}
