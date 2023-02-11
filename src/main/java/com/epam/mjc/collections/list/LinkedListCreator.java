package com.epam.mjc.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        LinkedList <Integer> myLinList = new LinkedList<>();
        if (sourceList.size() >0){
        for (int i=0; i<sourceList.size(); i++){
            if (sourceList.get(i)%2==0){
                myLinList.addLast(sourceList.get(i));}
            else {
                myLinList.addFirst(sourceList.get(i));}

        }}
        return myLinList;
    }
}
