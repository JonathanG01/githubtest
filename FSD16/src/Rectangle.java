
class Rectangle extends Shape{
	public Rectangle(double width, double height){
		    this.width = width;
	        this.height = height;
	    }

	    public  void draw(){
	        System.out.println("rectangle drawing...");
	    }


	    @Override
	    public void getArea() {
	        System.out.println(width * height);
	    }
}
 
