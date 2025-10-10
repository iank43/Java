class Main {

	public static void main(String[] args) {
    	(new Main()).init();
	}

  //1: printing a string
  void print(String s){
    System.out.println(s);
  }

  //2: Fahrenheit to Celsius temperature conversion
    double FtoC (double F){
      double C = (F - 32) * 5.0/9.0;
      return C;
    }

  //3: Sphere volume
    double Sphere (double r){
      double volume = 4/3.0*Math.PI*Math.pow(r,3);
      return volume;
    }
  //4: Cone volume
    double coneVolume (double radius, double height){
      double cvolume = Math.PI*Math.pow(radius,2)*(height/3.0);
      return cvolume;
    }

  //5: Distance between two coordinate points
    double distance (double x1, double x2, double y1, double y2){
      double dformula = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
      return dformula;
    }


  
  void init(){
    //1
    System.out.println("Enter your name ");
    String name = Input.readString();
    print("Welcome "+name);

    //2
    System.out.println("Enter Farenheit for conversion");
    double F = Input.readDouble();
    System.out.println("Farenheit in celcius is " + FtoC(F));
    //3
    System.out.println("Enter radius for volume");
    double r = Input.readDouble();
    System.out.println("volume of the sphere is " + Sphere(r));
    //4
    System.out.println("Enter radius for cvolume");
    double radius = Input.readDouble();
    System.out.println("Enter Height for cvolume");
    double height = Input.readDouble();
    System.out.println("volume of the cone is " + coneVolume(radius, height));
    //5
    System.out.println("Enter x1");
    double x1 = Input.readDouble();
    System.out.println("Enter x2");
    double x2 = Input.readDouble();
    System.out.println("Enter y1");
    double y1 = Input.readDouble();
    System.out.println("Enter y2");
    double y2 = Input.readDouble();
    System.out.println("the distance is " + distance(x1, x2, y1, y2));
  }
 
}