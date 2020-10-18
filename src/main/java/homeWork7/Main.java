package homeWork7;

public class Main {

    public static void main(String[] args) {
        Plate plate = new Plate(75);
        Cat[] cats = {
                new Cat("Амели"),
                new Cat("Каспер"),
                new Cat("Вольф"),
                new Cat("Кнопка"),
                new Cat("Гектор"),
                new Cat("Гендальф"),
                new Cat("Варламов"),
                new Cat("Сисиль"),
        };

        if (){
            for (Cat cat:cats) {
                cat.eat(plate);
            }
            for (Cat cat:cats) {
                System.out.println(cat);
            }
        }else if (){
            for (Cat cat:cats) {
                cat.addEat(plate);
            }
            for (Cat cat:cats) {
                System.out.println(cat);
            }
        }


    }
}