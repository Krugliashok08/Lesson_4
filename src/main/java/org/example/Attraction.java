package org.example;

public class Attraction {
    String name;

    String workingHours;

    String cost;



    public Attraction(String name, String workingHours, String cost) {

        this.name = name;

        this.workingHours = workingHours;

        this.cost = cost;

    }


    @Override
    public String toString() {
        return "Attraction{" +
                "name='" + name + '\'' +
                ", workingHours='" + workingHours + '\'' +
                ", cost=" + cost +
                '}';
    }
}


