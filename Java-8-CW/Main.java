class Main {
    public static void main(String[] args) {
    (new Main()).init();
    }
  // define the functions
  String madlib(String adj, String noun, String verb){
  }

  double areasq(double side){
    double area = side*side;
    return area;
  }
  double pirsqr(double radius){
    double ciarea = Math.pow(Math.PI*radius,2);
    return ciarea
  }
    // call the functions
  double result = areasq(2.5);
  System.out.println("Area is " + result)
  
  double cir = pirsqr(4.2);
  System.out.println("Circumference is " + result)
  
}