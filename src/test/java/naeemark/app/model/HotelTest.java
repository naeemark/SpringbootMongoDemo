package naeemark.app.model;

import naeemark.Address;
import naeemark.Hotel;
import org.assertj.core.api.Assertions;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;

/**
 * Created by Naeem <naeemark@gmail.com>.
 * <p>
 * Created on: 2018-12-15
 */
public class HotelTest {

    @Autowired
    private Address address;


    @Test
    public void testCreation() {

        Hotel hotel = new Hotel("Taj", 100, address, new ArrayList<>());
        Assert.assertEquals("Taj", hotel.getName());

        Assertions.assertThat(hotel.getName()).isNotBlank();
        Assert.assertEquals("Taj", hotel.getName());
        Assert.assertThat(hotel.getName(), Matchers.equalTo("Taj"));
        Assertions.assertThat(hotel.getName()).isEqualTo("Taj");

        Assertions.assertThat(hotel.getPricePerNight()).isGreaterThan(0);

    }
}
