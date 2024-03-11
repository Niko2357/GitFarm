import java.util.ArrayList;
import java.util.Scanner;

public class Barn {
    protected int bigAn;
    protected int smallAn;
    protected ArrayList<Animal> animals;

    public Barn(int bigAn, int smallAn) {
        this.bigAn = bigAn;
        this.smallAn = smallAn;
        animals = new ArrayList<>();
    }

    public String buy(Animal an){
        switch(an.size){
            case SMALL:
                if(smallAn < 10){
                    animals.add(an);
                    return "You brought this animal  " + an.type;
                }else{
                    return "You don't have enough space for this animal.";
                }
            case BIG:
                if(bigAn < 10){
                    animals.add(an);
                    return "You brought this animal  " + an.type;
                }else{
                    return "You don't have enough space for this animal.";
                }
        }
        return " ";
    }

    public String stroke(){
        System.out.println("Which animal would you like to stroke? (name)");
        System.out.println(animals);
        Scanner sc = new Scanner(System.in);
        String anim = sc.next();
        return "You stroked animal  " + anim;
    }

    public String sell(Animal an){
        animals.remove(an);
        return "You sold this animal  " + an.type + " " + an.name;
    }


    public int getBigAn() {
        return bigAn;
    }

    public void setBigAn(int bigAn) {
        this.bigAn = bigAn;
    }

    public int getSmallAn() {
        return smallAn;
    }

    public void setSmallAn(int smallAn) {
        this.smallAn = smallAn;
    }
}
