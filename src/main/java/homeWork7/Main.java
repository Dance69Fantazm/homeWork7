package homeWork7;

public class Main {

    public static void main(String[] args) {
        Plate plate = new Plate(25);
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

            for (Cat cat:cats) {
                cat.eat(plate);
            }
            for (Cat cat:cats) {
                System.out.println(cat);
            }
            for (Cat cat:cats) {
                cat.addEat(plate);
            }
            for (Cat cat:cats) {
                System.out.println(cat);
            }

    }
}