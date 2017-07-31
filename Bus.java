class Bus{
  private String name;
  private int number_of_passengers;
  private double weight;
  private Passenger[] aboard;


  public Bus(String name, int number_of_passengers, double weight){
    this.name = name;
    this.number_of_passengers = number_of_passengers;
    this.weight = weight;
    this.aboard = new Passenger[50];
  }
  public String getName(){
    return this.name;
  }
  public int getPassenger(){
    return this.number_of_passengers;
  }
  public double getWeight(){
    return this.weight;
  }
  public boolean readyToPickUp(){
    if (this.number_of_passengers < 50.00) return true;
    else return false;
  }  
// below is an example of a loop
  public int passengerCount(){
    int count = 0;
    for( Passenger passenger : this.number_of_passengers){
      if (passenger != null) {
        count++;
      }
    }
    return count;
  }
}
