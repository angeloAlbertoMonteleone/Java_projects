package com.angeloalberto.challenge;

public class MyLinkedList implements NodeList{
    private ListItem root = null;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }


    @Override
    public ListItem getRoot() {
        return null;
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
        if(item != null){
            System.out.println("Deleting item " +item.getValue());
        }
        ListItem currentItem = this.root;
        while (currentItem != null){
            int comparison = currentItem.compareTo(item);
            if(comparison == 0) {
                //found the item to delete
                if(currentItem == this.root){
                    this.root = currentItem.moveToNext();
                }else{
                    currentItem.moveToPrevious().setPrevious(currentItem.moveToPrevious());
                    if(currentItem.moveToPrevious() != null){
                        currentItem.moveToNext().setPrevious(item.moveToPrevious());
                    }
                }
                return true;
            } else if(comparison < 0){
                currentItem = currentItem.moveToNext();
            } else {
                //comparison > 0
                //we are at an item greater than the one to be deleted
                //so the item is not in the list
                return false;
            }
        }
        //we have reache the end of the list
        //withoud finding the item to delete
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        if(root == null){
            System.out.println("the list is empty");
        }else {
            while (root != null) {
                System.out.println(root.getValue());
                root = root.moveToNext();
            }
        }
    }
}
