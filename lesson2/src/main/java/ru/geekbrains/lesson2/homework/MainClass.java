package ru.geekbrains.lesson2.homework;

public class MainClass {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Barsik", 5, false);
        Cat cat2 = new Cat("Murka",4,false);
        Cat cat3 = new Cat("Asha", 8,false);
        Plate plate = new Plate(11);
        plate.info();
       if(plate.getFood() < cat1.getAppetite()){
           System.out.println("Котику не хвататет еды ");
       }else {
           plate.setFood(plate.getFood() - cat1.getAppetite());
           cat1.eat();
       }
        plate.info();
        if(plate.getFood() < cat2.getAppetite()){
            System.out.println("Кошке не хватило еды");
        }else {
            plate.setFood(plate.getFood() - cat2.getAppetite());
            cat2.eat();
        }
        plate.info();
        if(plate.getFood() < cat3.getAppetite()){
            System.out.println("Кошке не хватило еды");
        }else {
            plate.setFood(plate.getFood() - cat3.getAppetite());
            cat3.eat();
        }
        plate.info();
    }
}
