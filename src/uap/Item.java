package uap;

import java.util.Random;

public abstract class Item 
{
	    Random rand = new Random();
	    private  String id;
		private  double rate;
		private  boolean isAvailable;
		private  String  latestReservationRecordId;
		
			
		public Item(double rate)
		{
		
			this.id="" + rand.nextInt(10) + rand.nextInt(10) + rand.nextInt(10) + rand.nextInt(10);
			this.rate=rate;
			this.isAvailable=true;
		}
		  public String getId()
		{
			  return this.id;
		}
		  public double getRate()
		{
			  return this.rate;
		}
		 public boolean getIsAvailable()
		{
			 return this.isAvailable;
		}
		public String getSlatestReservationRecordId()
		{
			return this.latestReservationRecordId;
		}
		public void setRate(double rate)
		{
	        this.rate=rate;		
		}
		public void setIsAvailable(boolean isAvailable)
		{
		    this.isAvailable=isAvailable;
		}
		public void setlatestReservationRecordId(String latestReservationRecordId)
		{
		    this.latestReservationRecordId=latestReservationRecordId;
		}
		protected void prependWithId(String prefix)
		{
			this.id=prefix+getId();
		}
		public void reserve() throws NotAvailableException
		{
			if(getIsAvailable()==false)
			{
				throw new NotAvailableException("Reserved");
			}
			else 
			{
				setIsAvailable(false);
			}
		}
		
		public abstract String info();
		
		}


