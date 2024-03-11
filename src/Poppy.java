public class Poppy extends Flower{

    public Poppy(String name, double price, double neededArea, double chanceOfGrowth, boolean grown) {
        this.name = name;
        this.price = price;
        this.neededArea = neededArea;
        this.chanceOfGrowth = chanceOfGrowth;
        this.grown = grown;
    }

    public void seed(){
        Poppy poppy = new Poppy("Poppy", 144, 20, 8,false);
    }

    @Override
    public String toString() {
        return "Poppy{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", neededArea=" + neededArea +
                ", chanceOfGrowth=" + chanceOfGrowth +
                ", grown=" + grown +
                '}';
    }

}
