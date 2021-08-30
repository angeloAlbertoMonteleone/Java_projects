package com.angeloalberto.challenge;

public class SearchThree implements NodeList {
    private ListItem root = null;

    public SearchThree(ListItem root) {
        this.root = root;
    }


    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem item) {
        if(this.root == null){
            //the list was empty, and becomes the head of the list
            this.root = item;
            return true;
        }

        ListItem currentItem = this.root;
        while (currentItem != null){
            int comparison = (currentItem.compareTo(item));
            if(comparison < 0){
                //new item is grater, move right if possible
                if(currentItem.moveToNext() != null){
                    currentItem = currentItem.moveToNext();
                }else{
                    //there is no next, so insert at the end of the list
                    currentItem.setNext(item);
                    item.setPrevious(currentItem);
                    return true;
                }
            }else if (comparison > 0){
                if(currentItem.moveToPrevious() != null){
                    currentItem.moveToPrevious().setNext(item);
                    item.setPrevious(currentItem.moveToPrevious());
                    item.setPrevious(currentItem);
                    currentItem.setPrevious(item);
                }
            } else {
                //the node with a previous is the root
                item.setNext(this.root);
                this.root.setPrevious(item);
                this.root = item;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        if(root != null){
            traverse(root.moveToPrevious());
            System.out.println(root.getValue());
            traverse(root.moveToNext());
        }
    }
}
