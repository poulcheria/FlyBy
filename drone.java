public class drone
{
  public int drone_id;
  public String location;
  public float price;
  public String model;
  public float flight_range;
  public String quality_stream;
  public int flagged_drones;
  public int location_category;
  public Owner owner;
  
  
  public drone(int drone_id,String location,float price,String model,float flight_range,String quality_stream, int flagged_drones, int location_category,Owner owner){
     this.drone_id=drone_id;
     this.location=location;
     this.price=price;
     this.model=model;
     this.flight_range=flight_range;
     this.quality_stream=quality_stream;
     this.flagged_drones=flagged_drones;
     this.location_category=location_category;
     this.owner=owner;
    
    
    
    
    }
  
  
}
