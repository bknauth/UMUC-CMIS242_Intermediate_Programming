public class Triangle1 extends GeometricObject1 {
  private double side1;
  private double side2;
  private double side3;
  
  
  
  public Triangle1(){
  }
  
  
  /** Constructor */
  public Triangle1(double side1, double side2, double side3, String color, 
          boolean filled) {
    this.side1 = side1;
    this.side2 = side2;
    this.side3 = side3;
    setColor(color);
    setFilled(filled);
  }
  
  /** Implement the abstract method findArea in GeometricObject */
  public double getArea() {
    double s = (side1 + side2 + side3) / 2;
    return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
  }

  /** Implement the abstract method findCircumference in
   * GeometricObject
   **/
  public double getPerimeter() {
    return side1 + side2 + side3;
  }

  /** Override the toString method */
  public String toString() {
    // Implement it to return the three sides
    return "Triangle: side1 = " + side1 + " side2 = " + side2 +
      " side3 = " + side3;
  }
}

