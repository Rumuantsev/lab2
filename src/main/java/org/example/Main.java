package org.example;

public class Main {
    public static void main(String[] args) {
        Balanace balanace = new Balanace();
        balanace.addLeft(3);
        balanace.addRight(4);
        System.out.println(balanace.result());
    }
}

class Balanace{
    private int left;
    private int right;

    Balanace(){
        this.left = 0;
        this.right = 0;
    }

    Balanace(int left, int right){
        this.left = left;
        this.right = right;
    }

    public void addLeft(int left){
        this.left = left;
    }

    public void addRight(int right){
        this.right = right;
    }

    public String result(){
        if(this.left == this.right){
            return "=";
        } else if (this.left < this.right){
            return "R";
        } else{
            return "L";
        }
    }
}