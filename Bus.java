class Bus{
  private String name;
  private double weight;
  private Passenger[] aboard;


  public Bus(String name, double weight){
    this.name = name;
    this.weight = weight;
    this.aboard = new Passenger[50];
  }
  public String getName(){
    return this.name;
  }

  public double getWeight(){
    return this.weight;
  }
  public boolean readyToPickUp(){
    if (passengerCount() < 50.00) return true;
    else return false;
  }  
// below is an example of a loop
  public int passengerCount(){
    int count = 0;
    for( Passenger passenger : this.aboard){
      if (passenger != null) {
        count++;
      }
    }
    return count;
  }
}
