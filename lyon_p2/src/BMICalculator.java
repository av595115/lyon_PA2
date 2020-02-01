/*
 * User enters which unit they want, imperial or metric
 * Then based on that unit, a specific method is called
 * User enters in height and weight in their respective unit
 * If negative the program terminates
 * Then the information gets sent to be calculated into the BMI
 * Then the BMI is categorized into its respective category
 * The information is then displayed to the user
 * 
 * 
 */

import java.util.Scanner;

public class BMICalculator {
Scanner input = new Scanner(System.in);
private double height;
private double weight;
private double bmi;
private int unit;


//main included from assignment
public static void main(String[] args) {
    BMICalculator app = new BMICalculator();
    app.readUserData();
    app.calculateBmi();
    app.displayBmi();
}
//main included from assignment



public void readUserData() {
	readUnitType();
}

private void readUnitType() {
	setUnit(unit);
	System.out.println("Enter 1 for Imperial\nEnter 2 for Metric");
	this.unit = input.nextInt();
	if (unit == 1) {
	readMeasurementData();
	}
	else if (unit == 2) {
	readMeasurementData();
	}
	else {
	System.out.println("Enter a valid value.");
	readUnitType();
	}
	
}

private void readMeasurementData(){
	getUnit(unit);
	if (unit == 1) {
	readImperialData();
	}
	else if (unit == 2) {
	readMetricData();
	}
}

private void readImperialData() {
	setHeight(height);
	setWeight(weight);
	
	System.out.println("Enter your height in inches:\n");
	this.height = input.nextDouble();
	if (height<0) {
		System.out.println("Enter in a valid value.");
		System.exit(-1);
		}
	System.out.println("Enter your weight in pounds:\n");
	this.weight = input.nextDouble();
	if (weight<0) {
		System.out.println("Enter in a valid value.");
		System.exit(-1);
		}

	calculateBmi();
}	

private void readMetricData() {
	setHeight(height);
	setWeight(weight);
	
	System.out.println("Enter your height in meters:\n");
	this.height = input.nextDouble();
	if (height<0) {
	System.out.println("Enter in a valid value.");
	System.exit(-1);
	}
	System.out.println("Enter your weight in kilograms:\n");
	this.weight = input.nextDouble();
	if (weight<0) {
	System.out.println("Enter in a valid value.");
	System.exit(-1);
	}
	
	calculateBmi();

}

public void calculateBmi() {
	getUnit(unit);
	getHeight(height);
	getWeight(weight);
	setBmi(bmi);

	if (unit == 1) {
	bmi = ((weight*703)/(height*height));
	}
	else if (unit == 2) {
	bmi = ((weight)/(height*height));
	}
}

private void calculateBmiCategory() {
	getBmi(bmi);
	
	if(bmi<=18.5) {
	System.out.printf("Your BMI is %.2f and your category is underweight\n", bmi);
	}
	
	else if(bmi<=24.9) {
	System.out.printf("Your BMI is %.2f and your category is healthy\n", bmi);
	}
	
	else if(bmi<=29.9) {
	System.out.printf("Your BMI is %.2f and your category is overweight\n", bmi);
	}
	
	else if(bmi>=30) {
	System.out.printf("Your BMI is %.2f and your category is obese\n", bmi);
	}
	else {
	System.out.printf("Unable to calculate");
	readUnitType();
	}
}

private void displayBmi() {
	calculateBmi();
	calculateBmiCategory();
}

//get and set methods
private void setHeight(double height) {
	this.height = height;
}
private void setWeight(double weight) {
	this.weight = weight;
}
private void setBmi(double bmi) {
	this.bmi = bmi;
}
private void setUnit(int unit) {
	this.unit = unit;
}
public double getHeight(double height) {
	return height;
}
public double getWeight(double weight) {
	return weight;
}
public double getBmi(double bmi) {
	return bmi;
}
public int getUnit(int unit) {
	return unit;
}
//get and set methods

}

