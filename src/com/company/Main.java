package com.company;

public class Main {

    public static void main(String[] args) {
	Wall wall = new Wall(5,4);
	wall.getArea();
	wall.setHeight(-1.5);
	System.out.println("width= "+ wall.getWidth());
	System.out.println("height= "+ wall.getHeight());
	wall.getArea();
    }
}
