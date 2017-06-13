package com.example.sparken02.comparatordemo;

import java.util.Comparator;

/**
 * Created by sparken02 on 13/6/17.
 */

public class NameComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {


        Student s1=(Student)o1;
        Student s2=(Student)o2;

        return s1.name.compareTo(s2.name);
    }
}
