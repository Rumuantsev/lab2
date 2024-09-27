package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import org.example.Exception.HeightException;
import org.example.Exception.RadiusBaseException;
import org.example.geometry2d.Circle;
import org.example.geometry2d.Rectangle;
import org.example.geometry3d.Cylinder;


public  class Main {
    public static void main(String[] args) {
        System.out.println(" ");
        System.out.println("0: Exit;");
        System.out.println("1-5: Ex1-Ex5;");
        System.out.println("6-8: Circle, Rectangle, Cylinder;");
        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.println(" ");
            System.out.print("Input: ");
            int ex = in.nextInt();

            switch (ex) {
                case 0:
                    return;
                case 1:
                    Button button = new Button();
                    System.out.print("Input count click: ");
                    int clickCount = in.nextInt();
                    for(int i = 0; i < clickCount; ++i){
                        button.click();
                    }
                    continue;
                case 2:
                    Balance balance = new Balance();
                    System.out.print("Input left: ");
                    int left = in.nextInt();
                    balance.addLeft(left);
                    System.out.print("Input right: ");
                    int right = in.nextInt();
                    balance.addRight(right);
                    System.out.print("Result: ");
                    System.out.println(balance.result());
                    continue;
                case 3:
                    System.out.print("Input count sound: ");
                    int count = in.nextInt();
                    Bell.sound(count);
                    continue;
                case 4:
                    OddEvenSeparator numbers = new OddEvenSeparator();
                    numbers.addNumber(2);
                    numbers.addNumber(1);
                    numbers.addNumber(3);
                    numbers.addNumber(4);
                    numbers.addNumber(5);
                    System.out.print("Even: ");
                    System.out.println(numbers.even());
                    System.out.print("Odd: ");
                    System.out.println(numbers.odd());
                    continue;
                case 5:
                    Table table = new Table(2, 2);
                    table.setValue(0,0,1);
                    table.setValue(0,1,2);
                    table.setValue(1,0,3);
                    table.setValue(1,1,4);
                    System.out.print("Average: ");
                    System.out.println(table.average());
                    System.out.print("ToSting: ");
                    System.out.println(table.toString());

                    continue;
                case 6:
                    Circle circle = new Circle(2);
                    System.out.print(circle.area());
                    continue;
                case 7:
                    Rectangle rectangle = new Rectangle(2);
                    System.out.print(rectangle);
                    continue;
                case 8:
                    try {
                        Cylinder cylinder = new Cylinder(2, 4); // Вызов конструктора
                        System.out.print("Volume: ");
                        System.out.println(cylinder.volume());
                    } catch (RadiusBaseException | HeightException e) {
                        System.err.println("Exception: " + e.getMessage());
                    }
                    continue;
            }
            in.close();
        }

    }
}

 class Button {

    private int clickCount;

    public Button() {
        this.clickCount = 0;
    }

    // Метод для увеличения количества нажатий
    public void click() {
        ++clickCount;
        System.out.println("Count click: " + clickCount);
    }

}

class Balance {
    private int left;
    private int right;

    Balance(){
        this.left = 0;
        this.right = 0;
    }

    Balance(int left, int right){
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
    private final List<Integer> numbers = new LinkedList<>();

    OddEvenSeparator(List<Integer> inputNumbers){
        this.numbers.addAll(inputNumbers);
    }

    OddEvenSeparator(){

    }

    public void addNumber(int inputNumber){
        this.numbers.add(inputNumber);
    }

    public List<Integer> even(){
        List<Integer> result = new ArrayList<>();
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
    private final int[][] table;
    private final int rows;
    private final int cols;

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
        StringBuilder result = new StringBuilder();
        for (int[] ints : table) {
            for (int anInt : ints) {
                result.append(anInt);
                result.append(" ");
            }
        }
        return result.toString();
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
        return (double) sum / count;
    }
}

