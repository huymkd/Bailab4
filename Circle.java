package baitaplab4;

public class Circle {
    private double radius;
    private String color="White";
    public Circle(){
        this.radius=1.0;
        this.color="White";
    }
    public double getradius(){
        return this.radius;
    }
    public void setradius(double radius){
        this.radius=radius;
    }
    public String getcolor(){
        return this.color;
    }
    public String setcolor(String color){
        return this.color;
    }
    public String tostring(){
        return "Cricle[radius="+radius+",color="+color+"]";
    }
    public double getArae(){
        return radius=radius*radius*Math.PI;
    }
}
