package uap;

  public class HotelRoom extends Item
	{
		private String hotelName;
		private int rankOfHotel;
		private int maxCapacity;
		private boolean hasAC;
		public HotelRoom(String hotelName, int rankOfHotel, int maxCapacity, boolean hasAC,double rate)
		{
			super(rate);
			this.hotelName=hotelName;
			this.rankOfHotel=rankOfHotel;
			this.maxCapacity=maxCapacity;
			this.hasAC=hasAC;
			 prependWithId("h-");
		}
		
	    public String getHotelName() 
		{
			return this.hotelName;
		}
		public int getRank()
		{
			return this.rankOfHotel;
		}
		public int getMaxCapacity() 
		{
			return this.maxCapacity;
		}
		public boolean getHasAC() 
		{
			return this.hasAC;
		}
		
		@Override
		public String info()
		{
			return "Name:"+hotelName+" " +"Maximum Capacity:"+maxCapacity+" "+" Has AC or not:"+hasAC;
		}
		

	}


