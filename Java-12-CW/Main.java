class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
   

    
  }
/*
Problem 1:
Write a function collegeCredit() that accepts a course code and if a course gets college credit return true otherwise return false. If the 6th letter of the course code is "E" or "M" then it is a college credit course.
*/
boolean collegeCredit(String courseCode){
  if (courseCode.substring(5,6).equals("M") ||
      courseCode.substring(5,6).equals("E"))
    return true;
  else
    return false;

}


/*
Problem 2:
Write a function getCounselor() that accepts a student's official class code and returns their guidance counselor based on the either the first or the middle character of the official class code being:
B-Berrouet
C-Chu
D-Dinn
E-Eyzengart
F-Flores
G-Gibson
*/
String getCounselor(String ClassCode){
  if (ClassCode.substring(0,1).equals("B")){
    return "Berrouet"}
  if (ClassCode.substring(0,1).equals("C")){
    return "Chu"}
  if (ClassCode.substring(0,1).equals("D")){
    return "Dinn"}
  if (ClassCode.substring(0,1).equals("E")){
    return "E-Eyzengart"}
  if (ClassCode.substring(0,1).equals("F")){
    return "Flores"}
  if (ClassCode.substring(0,1).equals("G")){
    return "Gibson"}
}

/*  
Problem 3:
Write a function imageType() that accepts an image filename and returns the image type based on the file extension.

JPEG or JPG - Joint Photographic Experts Group
PNG - Portable Network Graphics
GIF - Graphics Interchange Format
PDF - Portable Document Format(not an image type)
*/ 

 
  
}