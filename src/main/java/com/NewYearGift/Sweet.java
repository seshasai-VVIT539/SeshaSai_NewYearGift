package com.NewYearGift;

//abstract class used for chocolates and candies
public abstract class Sweet {
//	name of the sweet
	String name;
//	weight of sweet in grams
	double weight;
//	cost of sweet 
	double cost;
//	percentage of sugar level in sweet
	double sugar_level;
//	name of the food type 
	String food_type;
//	different abstract methods present
	abstract void display();
	abstract String getName();
	abstract double getWeight();
	abstract double getCost();
	abstract double getSugarLevel();

}
