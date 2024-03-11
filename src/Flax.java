public class Flax extends Flower{

    public Flax(String name, double price, double neededArea, double chanceOfGrowth, boolean grown) {
        this.name = name;
        this.price = price;
        this.neededArea = neededArea;
        this.chanceOfGrowth = chanceOfGrowth;
        this.grown = grown;
    }

    public void seed(){
        Flax flax = new Flax("Flax", 120, 1, 6,false);
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
