package com.NewYearGift;

//Chocolate class extending from abstract class Sweet
class Chocolate extends Sweet
{
//	variable to indicate type of chocolate 
	String chocolate_type;
//	constructor
	public Chocolate(String n,String c_t,double c,double s_l,double w)
	{
		name=n;
		food_type="Chocolate";
		cost=c;
		sugar_level=s_l;
		weight=w;
		chocolate_type=c_t;
	}
//	Chocolate class's display method
	public void display()
	{
		System.out.println("Food type: "+food_type);
		System.out.println("Name: "+name);
		System.out.println("Chocolate Type: "+chocolate_type);
		System.out.println("Weight: "+weight+"g");
		System.out.println("Sugar level: "+sugar_level+"%");
		System.out.println("Cost: "+cost);
	}
	//Override different methods in Sweet Class
	public String getName()
	{
		return name;
	}
	public double getCost()
	{
		return cost;
	}
	public double getWeight()
	{
		return weight;
	}
	public double getSugarLevel()
	{
		return sugar_level;
	}
}
