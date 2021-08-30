package com.angeloalbertomonteleone.exercises;

public class Person {
    public static void main(String[] args) {

    }


    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName(){
        if(this.firstName.isEmpty()){
            return this.lastName;
        }
        return this.firstName;
    }

    public String getLastName(){
        if(this.lastName.isEmpty()){
            return this.firstName;
        }
        return this.lastName;
    }

    public int getAge(){
        return this.age;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setAge(int age){
        if(age < 0 || age > 100){
            this.age = 0;
        }
        this.age = age;
    }

    public boolean isTeen(){
        if(this.age > 12 && this.age < 20){
            return true;
        }else{
            return false;
        }
    }

    public String getFullName(){
        if(this.firstName.isEmpty() && this.lastName.isEmpty()){
            return "";
        }else if(this.lastName.isEmpty()){
            return this.firstName;
        }else if(this.firstName.isEmpty()){
            return this.lastName;
        }else{
            return this.firstName + " " + this.lastName;
        }
    }
}
