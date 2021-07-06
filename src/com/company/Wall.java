package com.company;

public class Wall {
    private double width;
    private double height;

    public Wall(){

    }

    public Wall(double width,double height){
        if(width <0){
            width =0;
            this.width=width;
        }else if(height<0){
            height =0;
            this.height=height;
        }else {
            this.width = width;
            this.height = height;
        }
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        if (width < 0) {
            width = 0;
            this.width = width;
        }else{
            this.width=width;
        }
    }

    public void setHeight(double height) {
        if(height<0){
            height=0;
            this.height=height;
        }else{
            this.height = height;
        }

    }

    public void getArea(){
        System.out.println("The Width : "+ width + " The Height : "+ height + " The area is : "+ width*height );
    }
}
