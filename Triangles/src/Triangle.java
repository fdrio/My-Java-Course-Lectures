
public class Triangle {
	 
	   private int width;  
	   
	   public Triangle(int aWidth) 
	   { 
	      width = aWidth; 
	   } 
	   public int getArea() 
	   { 
		   if (width == 1) { return 1; } 
		   Triangle smallerTriangle = new Triangle(width - 1); 
		   int smallerArea = smallerTriangle.getArea(); 
		   return smallerArea + width; 

	   } 
	

}
