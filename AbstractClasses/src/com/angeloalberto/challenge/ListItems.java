package com.angeloalberto.challenge;

import java.util.LinkedList;

abstract class ListItem {
    protected ListItem rightLink = null;
    protected ListItem leftLink = null;
    protected Object value;

    public ListItem(Object value) {
        this.value = value;
    }

     abstract ListItem moveToNext();
     abstract ListItem setNext(ListItem item);
     abstract ListItem moveToPrevious();
     abstract ListItem setPrevious(ListItem item);

     abstract int compareTo(ListItem item);

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
