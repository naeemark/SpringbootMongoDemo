package naeemark.app.repository;

import naeemark.Address;
import naeemark.Hotel;
import naeemark.HotelRepository;
import org.assertj.core.api.AbstractStringAssert;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by Naeem <naeemark@gmail.com>.
 * <p>
 * Created on: 2018-12-15
 */

@DataMongoTest
@RunWith(SpringRunner.class)
public class HotelRepositoryTest {

    @Autowired
    private HotelRepository repository;

    @Test
    public void testFindByNameTest(){

        String id = this.repository.save(new Hotel("Taj", 100, new Address("Kul", "ML"), new ArrayList<>())).getId();

        Optional<Hotel> byId = this.repository.findById(id);
        Hotel hotel = byId.orElse(null);
        assertThat(hotel).isNotNull();
        assertThat(hotel.getId()).isNotBlank();
        assertThat(hotel.getName()).isNotBlank();
        assertThat(hotel.getName()).isEqualTo("Taj");

    }
}
