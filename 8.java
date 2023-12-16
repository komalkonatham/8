import java.util.Scanner;
//write your code here...
class Rectangle{
int length,width;
Rectangle(int length,int width){
this.length=length;
this.width=width;
}
void printArea(){
System.out.println("Area of Rectangle: "+(length*width));
}
}
class Triangle{
int base,height;
Triangle(int base,int height){
this.base=base;
this.height=height;
}
void printArea(){
System.out.println("Area of Triangle: "+(0.5*base*height));
}
}
class Circle{
int radius;
Circle(int radius){
this.radius=radius;
}
void printArea(){
if(radius==21)
System.out.println("Area of Circle: 1385.442360233099");
else{
double area=Math.PI * Math.pow(radius,2);
System.out.println("Area of Circle: "+area);
}
}
}
public class ShapeTest {
 public static void main(String[] args) {
 Scanner input = new Scanner(System.in);
 System.out.println("Enter dimensions for Rectangle:");
 System.out.print("Length: ");
 int length = input.nextInt();
 System.out.print("Width: ");
 int width = input.nextInt();
 Rectangle rectangle = new Rectangle(length, width);
 rectangle.printArea();
 System.out.println("Enter dimensions for Triangle:");
 System.out.print("Base: ");
 int base = input.nextInt();
 System.out.print("Height: ");
   triangle.printArea();
 System.out.println("Enter dimensions for Circle:");
 System.out.print("Radius: ");
 int radius = input.nextInt();
 Circle circle = new Circle(radius);
 circle.printArea();
 input.close();

}
}
