class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }

  void init(){
  
    // Call the function discount_rate()
    System.out.println("enter amount spent");   
    double amount = Input.readDouble();
    double rate = discount_rate(amount);

    // Call the function honors()

   
    // Call the function shortSize()
 
    
  }

  /*
    Problem 1:      
    Write a function discount_rate() that takes an amount spent
    at the grocery and returns the rate 10% if the amount
    spent is over $100, otherwise it returns 0%.
  */
  double discount_rate(double amount){
    if(amount > 100){
      return 0.1;
    }else{
      return 0;
  }

  /*
    Problem 2:
    Write a function honors() that takes a GPA (0 - 4.0) and returns 
    a string "Honors Student" if the GPA is 3.5 or above; otherwise
    it returns "Work harder".
  */

  
  /*
    Problem 3:
    Write a function shortsSize() that takes a waist measurement
    in inches and returns a string "Medium" if the measurement
    is under 36inches; otherwise it returns "Large".
  */


  
  }
}