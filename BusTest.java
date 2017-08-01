import static org.junit.Assert.assertEquals;
import org.junit.*;

public class BusTest {

  Bus bus;

  @Before
  public void before(){
    bus = new Bus("#16", 17);
  }

  @Test
  public void hasName(){
    assertEquals("#16", bus.getName());
  }

  // @Test
  // public void hasPassengers(){
  //   assertEquals(17, bus.getPassenger());
  // }

  @Test
  public void hasWeight(){
    assertEquals(17, bus.getWeight(), 0.01);
  }

  @Test
  public void readyToHPickUpIfLessThan50Passengers(){
    assertEquals(true, bus.readyToPickUp());
  }
  @Test
  public void busStartsEmpty(){
    assertEquals(0, bus.passengerCount());
  }


 
}
