package uap;

 import java.util.ArrayList;

	public class ReservationSystem 
	{
		private String name;
		private ArrayList<Item> items = new ArrayList<>();
		private ArrayList<User> users = new ArrayList<>();
		private ArrayList<ReservationRecord> records = new ArrayList<>();
		
			public ReservationSystem(String name)
		    {
			this.name=name;
			}
		    public String getName()
            {
		    	return this.name;
		    }
		    public ArrayList<Item> getItem()
		    {
				return this.items;
			}
			public ArrayList<User> getUsers()
			{
				return users;
			}
			public ArrayList<ReservationRecord> getRecords()
			{
				return records;
			}
			public String addUser(String name, int age, boolean isAdmin) 
			{
				User user=new User(name,age,isAdmin);
				users.add(user);
				return user.getID();
				
			}
		    
			public String addItem(String model,int capacity,double enginePower,double rate) 
			{
				Item vehicle= new Vehicle( model,capacity,enginePower,rate);
				items.add(vehicle);
				return vehicle.getId();
			}
			public String addItem(String hotelName, int hotelRank, int maxCapacity, boolean hasAC,double rate) 
			{
				Item hotelRoom=new HotelRoom(hotelName,hotelRank,maxCapacity,hasAC,rate);
				items.add(hotelRoom);
				return hotelRoom.getId();
			}
			public String addItem(String restaurantName,int capacity,double rate)
			{
			   Item restaurant =new Restaurant(restaurantName,capacity,rate);
			   items.add(restaurant);
			   return restaurant.getId();
			}
			public ArrayList<HotelRoom> findRooms(String hotelName, int capacity, boolean hasAC) throws	NotAvailableException
			{
				ArrayList<HotelRoom>rooms=new ArrayList<>();
				for(Item i:items) 
				{
					if(i instanceof HotelRoom)
					{
					  HotelRoom r=(HotelRoom)i;
					  if(r.getHotelName().equals(hotelName) && r.getMaxCapacity()==capacity && r.getHasAC()==hasAC)
					  {
						  rooms.add(r);
					  }
					}
				}
				if(rooms.isEmpty()) {
					throw new NotAvailableException("Hotel not Found");
				}
				return rooms;
			}
			public ArrayList<HotelRoom> findRooms(String hotelName, int capacity, boolean hasAC, int minRent, int maxRent) throws NotAvailableException
			{
				ArrayList<HotelRoom>rooms=new ArrayList<>();
				for(Item i:items) 
				{
					if(i instanceof HotelRoom)
					{
					  HotelRoom r=(HotelRoom)i;
					  if(r.getHotelName().equals(hotelName) && r.getMaxCapacity()==capacity && r.getHasAC()==hasAC && r.getRate()>=minRent && r.getRate()<=maxRent)
					  {
						  rooms.add(r);
					  }
					}
				}
				if(rooms.isEmpty()) {
					throw new NotAvailableException("Hotel not Found");
				}
				return rooms;
			}
			public ArrayList<HotelRoom> getRooms() throws NotAvailableException
			{
				ArrayList<HotelRoom>rooms=new ArrayList<>();
				for(Item i:items) 
				{
					if(i instanceof HotelRoom)
					{
					  HotelRoom r=(HotelRoom)i;
					  rooms.add(r);
					}
			    }
				if(rooms.isEmpty()) {
					throw new NotAvailableException("Not Found");
				}
				return rooms;
			}			
					
	}
			

