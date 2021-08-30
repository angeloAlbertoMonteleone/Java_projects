package com.angeloalberto.challenge;

public class Main {
    public static void main(String[] args) {
        SearchThree list = new SearchThree(null);
        list.traverse(list.getRoot());

        String stringData = "5 6 7 8 2 4 3 5 10 3 "; // "Adelfia Bari Lecce Brindisi Foggia Salerno Avellino";

        String[] data = stringData.split(" ");

        for (String s : data){
            list.addItem(new Node(s));
        }

        list.traverse(list.getRoot());

    }
}
