// Multilevel Inheritance - 2
class Vehicle
{
	String company,model,year;
	void vehicle_getinfo()
	{
		company = "Mahindra";
		model = "XUV-700 Auto Pilot";
		year = "2023";
	}
	void vehicle_dispinfo()
	{
		System.out.println("-+-> Vehicle Information <-+-");
		System.out.println("Company = "+company);
		System.out.println("Model = "+model);
		System.out.println("Year = "+year);
	}
}
class Car extends Vehicle
{
	String fuel_type,color;
	void car_getinfo()
	{
		fuel_type = "Battery";
		color = "Black";
	}
	void car_dispinfo()
	{
		System.out.println("\n-+-> Car Information <-+-");
		System.out.println("Fuel Type = "+fuel_type);
		System.out.println("Color = "+color);
	}
}
class Sports_Car extends Car
{
	int speed;
	void sport_getinfo()
	{
		speed = 200;
	}
	void sport_dispinfo()
	{
		System.out.println("\n-+-> Sports Car <-+-");
		System.out.println("Speed = "+speed);
	}
}
class J45
{
	public static void main(String args[])	
	{
		Sports_Car sc = new Sports_Car();
		sc.vehicle_getinfo();
		sc.car_getinfo();
		sc.sport_getinfo();

		sc.vehicle_dispinfo();
		sc.car_dispinfo();
		sc.sport_dispinfo();
	}
}

