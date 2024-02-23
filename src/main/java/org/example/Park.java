package org.example;

public class Park {
    private String name;
    private int hours;
    private int price;

    public Park(String name, int hours, int price){
    this.name =name;
    this.hours =hours;
    this. price =price;
}

    public static class Attraction{
       private String name;
       private int hours;
       private int price;


        public Attraction(String name, int hours, int price) {
            this.name = name;
            this.hours = hours;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getHours() {
            return hours;
        }

        public void setHours(int hours) {
            this.hours = hours;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        @Override
        public String toString() {
            return new Park(this.name,this.hours, this.price).toString();
        }
    }
}

