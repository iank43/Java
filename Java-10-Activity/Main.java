class Main {
	public static void main(String[] args) {
    	(new Main()).init();
	}

	void init(){
   // Invoke functions with appropriate arguments
   

  }

/* Challenge 1:
  Write a function "gpa" that takes in the GPA value and returns the following: 
  if GPA is over 90, return GPA weighted by an extra 10%;
  otherwise return the raw GPA.
*/
double gpa(double GPA){
  if (GPA>90){
    return (GPA*1.10);
  }
  else
    return GPA;
}

  
/* Challenge 2:
    Write a function "isGraduating" that accepts a grade level and number of credits earned. It returns the boolean value TRUE if a student is a Senior and has 44 or more credits; otherwise it returns FALSE. 
  
  In the init() function:
  Display to console "Student Graduating" or "Student NOT Graduating" depending on the value returned by the function.
*/
boolean isGraduating(String GradeLvl, int credits){
  if ((GradeLvl == "Senior" || GradeLvl == "senior") && credits >= 44){
    return true;
  }
  else
    return false;
}



/* Challenge 3:  BMI
  Write a function "BMI" that accepts a weight in pounds and a height in inches. 
  Calculate the BMI (search up the formula) and return the following:
    BMI 18.4 or less:  return Underweight
    BMI over 18.4 to under 25.0:  return Normal
    BMI of 25.0 or more to under 40.0:  return Overweight
    BMI of 40.0 or more:  return  Obese 
*/
  String BMI(double kilograms, double meters){
    double formula = (kilograms/Math.pow(meters,2));
    if (formula<=18.4){
      return "Underweight";
    }
    else if (formula>18.4 && formula<25.0){
      return "Normal";
    }
    else if (formula>=25.0 && formula<40.0){
      return "Overweight";
    }
    else if (formula>=40.0){
      return "Normal";
    }
}  
/* Challenge 4:
  Write a function "shippingCost" that accepts a weight in pounds and returns:
       0.00, if 10 pounds or less,
       5.00, if more than 10 pounds but 15 pounds or less,
       10.00, if more than 15 pounds but 25 pounds or less,
       10.00 plus 2 cents per pound over 25 pounds, if over 25 pounds.
*/
  double shippingCost(double weightInPounds){
    if (weightInPounds<=10.0){
      return 0.00;
    }
    if (weightInPounds>10.0 && weightInPounds<=15.0){
      return 5.00;
  }
  if (weightInPounds>15.0 && weightInPounds>=25.0){
    return 10.00;
  }
  if (weightInPounds>25.0){
    return 10.00 + weight*1.02;
  }

/* Challenge 5:
  Write a function "blueOrViolet" that accepts a light frequency in THz and returns true for either blue frequencies (600-670 THz inclusive) or violet frequencies (700-750 THz inclusive), otherwise return false.
*/
boolean blueOrViolet(int Bluelight, int VioletFreq){
  if ((Bluelight>= 600 && Bluelight<=670)|| (VioletFreq>= 700 && VioletFreq<=750))
    return true;
  }
  else
    return false;
}


  
} 