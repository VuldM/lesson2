package ru.geekbrains.lesson2.homework;

public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        if (food < 0){
            System.out.println("Кому-то не хватило еды");
        }else{
            this.food = food;
        }
    }
    public void info() {
        System.out.println("plate: " + food);
    }
}
