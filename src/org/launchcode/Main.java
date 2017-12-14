package org.launchcode;

import org.launchcode.comparators.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<City> cities = CityData.loadData();

        // TODO - Use different comparators here
        StateComparator stateComparator = new StateComparator();
        PopulationComparator populationComparator = new PopulationComparator();
        AreaComparator areaComparator = new AreaComparator();
        NameComparator nameComparator = new NameComparator();

        CompoundComparator comparator = new CompoundComparator();
        comparator.add(stateComparator);
        comparator.add(nameComparator);

        cities.sort(comparator);

        printCities(cities);

//        NameComparator nameComparator = new NameComparator();
//        StateComparator stateComparator = new StateComparator();
//        City cityA = cities.get(0);
//        City cityB = cities.get(1);
//        City cityG = cities.get(2);
//        City cityD = cities.get(3);
//        City cityE = cities.get(4);
//        City cityF = cities.get(5);
//        City cityC = cities.get(6);
//        City cityH = cities.get(7);
//        City cityI = cities.get(8);
//        City cityJ = cities.get(9);
//
//
//        int stateResult = stateComparator.compare(cityC, cityG);
//        int nameResult = nameComparator.compare(cityC, cityG);
//
//        boolean bool = (nameResult == 0);
//
//        System.out.println("\n*************************\n\n" + cityC.getName() + ", " + cityC.getState() + "\n" + cityG.getName() + ", " + cityG.getState() + "\n");
//
//        if (stateResult == 0) {
//            System.out.println("same state!" + "\n" + "same name? " + bool + "\n" + "nameResult: " + nameResult);
//        } else {
//            System.out.println("different states" + "\n" + "stateResult: " + stateResult);
//        }


    }

    private static void printCities(ArrayList<City> cities) {

        System.out.println(City.getTableHeader());

        for(City c : cities) {
            System.out.println(c);
        }

    }
}
