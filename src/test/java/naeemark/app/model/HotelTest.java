package naeemark.app.model;

import naeemark.Address;
import naeemark.Hotel;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by Naeem <naeemark@gmail.com>.
 * <p>
 * Created on: 2018-12-15
 */
public class HotelTest {


    @Test
    public void testCreation() {

        Address address = new Address("KL", "ML");

        Hotel hotel = new Hotel("Taj", 100, address, new ArrayList<>());
        Assert.assertEquals("Taj", hotel.getName());
        Assert.assertEquals("KL", hotel.getAddress().getCity());

    }
}
