package ru.mirea.gibo0318.lab2;

public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball(100, 100);
        System.out.println(b1);
        b1.move(25, 50);
        System.out.println(b1);
    }
}
