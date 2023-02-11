package com.epam.mjc.collections.list;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        Collections.sort(sourceList, new ListComparator());
    }

}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int a1 = Integer.parseInt(a);
        int b1 = Integer.parseInt(b);

        if (a1 * a1 == b1 * b1) {
            if (a1<b1){
                    return -1;
                }
            }


        if (a1 * a1 < b1 * b1 ) {
            return -1;
        }

return  1;
    }
}
