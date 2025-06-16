package uap;

	public class Vehicle extends Item 
	{
		 private String model;
		 private int capacity;
		 private double enginePower;
		 
		 public Vehicle(String model,int capacity,double enginePower,double rate)
		 {
			 super(rate);
			 this.model=model;
			 this.capacity=capacity;
			 this.enginePower=enginePower;
			 prependWithId("v-");
		 }
		 public String getModel()
		    {
				return this.model;
		    }
			public int getCapacity() 
			{
				return this.capacity;
			}
			public double getEnginePower() 
			{
				return this.enginePower;
			}
		 @Override
		 public String info()
		 {
			 return "Model:"+model+" " +"Capacity:"+capacity+" "+" Engine power:"+enginePower;
		 }
		
	}


