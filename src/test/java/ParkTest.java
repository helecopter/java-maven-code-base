import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParkTest {


    @Test
    public void build_parking_space(){
        Park park = new Park();
        park.build(10);
        assertEquals(park.getParkingSpace(),10);
    }

    @Test
    public void query_remain_parking_space(){

    }
}
