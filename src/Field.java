import java.sql.SQLOutput;

public class Field {
    protected double area;
    protected int maxPlants;



    public Field(double area, int maxPlants ) {
        this.area = area;
        this.maxPlants = maxPlants;
    }


    public void plant(Flower fl){
        if((area > fl.neededArea || area == fl.neededArea) && maxPlants != 5){
            area = area - fl.neededArea;
            maxPlants += 1;
        } else{
            System.out.println("You cannot plant right now. You reached maximum number of plants or run out of space.");
        }
    }

    public String water(Flower fl){
        fl.chanceOfGrowth += 3;
        return "You watered flower  " + fl.name;
    }

    public String harvest(Flower fl){
        if(fl.grown){
            area = area + fl.neededArea;
            return "You harvested this flower  " + fl.name;
        }else{
            return "You cannot harvest this flower, it's not grown.";
        }
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        if(area > 100){
            this.area = 100;
        }else{
            this.area = area;
        }
    }

    public int getMaxPlants() {
        return maxPlants;
    }

    public void setMaxPlants(int maxPlants) {
        if(maxPlants > 5){
            this.maxPlants = 5;
        }else{
            this.maxPlants = maxPlants;
        }
    }


}
