public class Rent
{
  public int rent_id;
  public Customer customer;
  public Owner owner;
  public drone drone;
  
  
  public Rent(int rent_id ,Customer customer,Owner owner,drone drone){
        this.rent_id=rent_id;
        this.customer=customer;
        this.owner=owner;
        this.drone=drone;
    }
}
