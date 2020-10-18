package homeWork7;

public class Cat{

    private String name;
    private boolean full;
    private int appetite;

    public Cat(String name){
        this.name = name;
        full = false;
        appetite = 10;
    }

    public String getName() {
        return name;
    }

    public void eat(Plate plate){
        if (plate.foodEat(appetite)) {
            System.out.println("Кот " + name + " сыт.");
            full = true;
        }else {
            System.out.println("Кот " + name + " голоден.");
        }
    }
    public void addEat(Plate plate2){
        if (plate2.addFood(1)) {
            System.out.println("Кот " + name + " подкормили ;)");
            full = true;
        }else {
            System.out.println("Кот " + name + " голоден.");
        }
    }

    public boolean isFull() {
        return full;
    }

    @Override
    public String toString() {
        return "Cat: " +
                "name='" + name + '\'' +
                ", full=" + full;
    }
}
