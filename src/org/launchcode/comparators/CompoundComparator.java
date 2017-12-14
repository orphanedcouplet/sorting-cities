package org.launchcode.comparators;

import org.launchcode.City;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CompoundComparator implements Comparator<City> {

    private List<Comparator<City>> comparators = new ArrayList<>();

    public void add(Comparator<City> comparator) {
        comparators.add(comparator);
    }

    @Override
    public int compare(City o1, City o2) {

        for (Comparator<City> comparator : comparators) {
            if (comparator.compare(o1, o2) != 0) {
                return comparator.compare(o1, o2);
            }
        }

//        for (Comparator<City> comparator : comparators) {
//            while (comparator.compare(o1, o2) == 0) {
//                continue;
//            }
//            return comparator.compare(o1, o2);
//        }


        return comparators.get(0).compare(o1, o2);
    }

    public List<Comparator<City>> getComparators() {
        return comparators;
    }

    public void setComparators(List<Comparator<City>> comparators) {
        this.comparators = comparators;
    }
}
