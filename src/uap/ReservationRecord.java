package uap;

import java.time.LocalDate;
import java.util.Random;

public class ReservationRecord 
{   Random rand = new Random();
	private String id; 
	private String itemId;
	private String userId;
	private LocalDate reservation_start_date;
	private LocalDate reservation_end_date; 
	private String note;
	private int quantity;
	
	public ReservationRecord(String itemId, String userId, LocalDate reservation_start_date, LocalDate reservation_end_date)
	{   
		this.id="" + rand.nextInt(10) + rand.nextInt(10) + rand.nextInt(10) + rand.nextInt(10);
		this.itemId=itemId;
		this.userId=userId;
		this.reservation_start_date=reservation_start_date;
		this.reservation_end_date=reservation_end_date;
		this.note="";
	}
	public ReservationRecord(String itemId, String userId, LocalDate reservation_start_date, LocalDate reservation_end_date, int quantity)
	{   
		this.id="" + rand.nextInt(10) + rand.nextInt(10) + rand.nextInt(10) + rand.nextInt(10);
		this.itemId=itemId;
		this.userId=userId;
		this.reservation_start_date=reservation_start_date;
		this.reservation_end_date=reservation_end_date;
		this.quantity=quantity;
		this.note="";
	}
	public String getId()
	{
		  return id;
	}
	public String getItemId()
	{
		  return itemId;
	}
	public String getUserId()
	{
		  return userId;
	}
	public LocalDate getReservation_start_date()
	{
		  return reservation_start_date;
	}
	public LocalDate getReservation_end_date()
	{
		  return reservation_end_date;
	}
	public int getQuantity()
	{
		  return quantity;
	}
	public String getNote()
	{
		  return note;
	}
	public void setItemId(String itemId)
	{
        this.itemId=itemId;		
	}
	public void setUserId(String userId)
	{
        this.userId=userId;		
	}
	
	public void setReservation_start_date(LocalDate reservation_start_date)
	{
        this.reservation_start_date=reservation_start_date;		
	}
	public void setReservation_end_date(LocalDate reservation_end_date)
	{
        this.reservation_end_date=reservation_end_date;		
	}
	public void setNote(String note)
	{
        this.note=note;		
	}
	public void setQuantity(int quantity)
	{
        this.quantity=quantity;		
	}
	
}
