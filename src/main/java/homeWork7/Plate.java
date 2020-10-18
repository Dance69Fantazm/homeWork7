package homeWork7;

public class Plate {
    private int food;

    public Plate(int food){
        this.food = food;
    }

    public int getFood(){
        return food;
    }

    public boolean foodEat(int amount){
        if(amount < 0){ return false; }
        if(amount > food){ return false; }
        food -= amount;
        return true;
    }

    public boolean addFood(int amount){
        if(amount < 0){ return false; }
        if(amount > food){ return false; }
        food += amount;
        return true;
    }

    @Override
    public String toString(){
        return "Plate{" + "food=" + food + '}';
    }
}
