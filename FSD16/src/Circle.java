
class Circle extends Shape{
	public Circle(double radius){  //constructor
        this.radius = radius;  
    }

    public void draw(){
        System.out.println("circle drawing...");
    }

    @Override
    public void getArea() {
        System.out.println(pie * radius * radius);
    }
}
