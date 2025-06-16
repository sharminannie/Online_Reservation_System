package uap;

	public class Restaurant extends Item
	{
		private String restaurantName;
		private int  capacity;
		private int occupied;


	public Restaurant(String restaurantName,int capacity,double rate)
	{
		super(rate);
		this.restaurantName=restaurantName;
		this.capacity=capacity;
		prependWithId("r-");
		
	}
	public String getName() 
	{
		return this.restaurantName;
	}
	public int getCapacity() 
	{
		return this.capacity;
	}
	public int getOccupied() 
	{
		return this.occupied;
	}
	public void setOccupied(int occupied) 
	{
		this.occupied=occupied;
	}
	@Override
	public String info()
	{
		return "Restaurant Name:" +restaurantName;
	}
	public void reserve(int noOfGuest) throws NotAvailableException
	{
		if(this.capacity-this.occupied < noOfGuest)
		{
			throw new NotAvailableException("Not enough space");
		}
		else
		{
			this.occupied+=noOfGuest;
		}
	}
	
}
		
