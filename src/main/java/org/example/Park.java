package org.example;

import java.util.ArrayList;
import java.util.List;

public class Park {
    private static List<Attraction> attractions;


    public Park() {

        attractions = new ArrayList<>();

    }


    public static void addAttraction(String name, String workingHours, String cost) {

        Attraction attraction = new Attraction(name, workingHours, cost);

        attractions.add(attraction);

    }


    public void printAttractions() {

        for (Attraction attraction : attractions) {

            System.out.println(attraction);

        }
    }
}
