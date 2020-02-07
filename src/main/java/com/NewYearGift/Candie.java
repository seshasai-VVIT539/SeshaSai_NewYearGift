package com.NewYearGift;

// Candie class extended from the abstract class Sweet
public class Candie extends Sweet
{
//	to mention the color of sweet
	String color;
//	constructor of the cla
	public Candie(String n,double w,double c,double s_l,String col)
	{
		//Initialising the members of class 
		name=n;
		weight=w;
		cost=c;
		food_type="Candie";
		sugar_level=s_l;
		color=col;
	}
	public void display()
	{
		//Sweet class's display method overriding 
		System.out.println("Food type: "+food_type);
		System.out.println("Name: "+name);
		System.out.println("Weight: "+weight+"g");
		System.out.println("Sugar level: "+sugar_level+"%");
		System.out.println("Cost: "+cost);
	}
	//Overriding different methods in Sweet Class
	public String getName()
	{
		return name;
	}
	public double getWeight()
	{
		return weight;
	}
	public double getCost()
	{
		return cost;
	}
	public double getSugarLevel()
	{
		return sugar_level;
	}
}
