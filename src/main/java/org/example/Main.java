package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
        Balanace balanace = new Balanace();
        balanace.addLeft(3);
        balanace.addRight(4);
        System.out.println(balanace.result());*/
        //Bell.sound(2);
        /*Integer[] inputArray = {1, 2, 3, 4, 5, 6};
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(inputArray));
        OddEvenSeparator numbers = new OddEvenSeparator(arrayList);
        numbers.addNumber(2);
        System.out.print(numbers.even());
        System.out.print(numbers.odd());*/
        /*Button button = new Button();
        button.click();
        button.click();
        button.click();*/

        /*Table table = new Table(2, 2);
        table.setValue(0,0,1);
        table.setValue(0,1,2);
        table.setValue(1,0,3);
        table.setValue(1,1,4);
        //System.out.print(table.average());
        System.out.print(table.toString());*/


    }
}

class Button {

    private int clickCount;

    public Button() {
        this.clickCount = 0;
    }

    // Метод для увеличения количества нажатий
    public void click() {
        clickCount++;
        System.out.println("Count click: " + clickCount);
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

class Bell{
    static void sound(int count){
        for(int i = 0; i < count; ++i){
            System.out.print("ding");
            System.out.println(" dong");
        }
    }
}

class OddEvenSeparator{
    private ArrayList<Integer> numbers = new ArrayList<>();
    OddEvenSeparator(ArrayList<Integer> inputNumbers){
        for(int i = 0; i < inputNumbers.size(); ++i){
            this.numbers.add(inputNumbers.get(i));
        }
    }
    public void addNumber(int inputNumber){
        this.numbers.add(inputNumber);
    }

    public ArrayList<Integer> even(){
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 0; i < this.numbers.size(); ++i){
            if(this.numbers.get(i) % 2 == 0){
                result.add(this.numbers.get(i));
            }
        }
        return result;
    }
    public ArrayList<Integer> odd(){
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 0; i < this.numbers.size(); ++i){
            if(this.numbers.get(i) % 2 != 0){
                result.add(this.numbers.get(i));
            }
        }
        return result;
    }

}

class Table {
    private int[][] table;
    private int rows;
    private int cols;

    Table(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.table = new int[rows][cols];
    }

    public int getValue(int row, int col) {
        return table[row][col];
    }

    public void setValue(int row, int col, int value) {
        table[row][col] = value;
    }

    public int rows() {
        return rows;
    }

    public int cols() {
        return cols;
    }

    public String toString() {
        String result = "";
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                result += String.valueOf(table[i][j]);
                result += " ";
            }
        }
        return result;
    }

    public double average() {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                sum += table[i][j];
                ++count;
            }
        }
        double result = (double) sum / count;
        return result;
    }
}

