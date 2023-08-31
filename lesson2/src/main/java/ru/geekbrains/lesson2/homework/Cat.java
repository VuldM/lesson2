package ru.geekbrains.lesson2.homework;
    public class Cat {
        private final String name;

        private final int appetite;
       private boolean satiety;
        public Cat(String name, int appetite, boolean satiety) {
            this.name = name;
            this.appetite = appetite;
            this.satiety = satiety;
        }


        public int getAppetite() {
            return appetite;
        }

        public void setSatiety(boolean satiety) {
            this.satiety = satiety;
        }

        public void eat() {

            setSatiety(true);
            System.out.println("кот(кошка) "+name+" поел(а). Сытость - "+satiety);
        }
    }

