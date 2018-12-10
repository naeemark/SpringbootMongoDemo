package naeemark;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Naeem <naeemark@gmail.com>.
 * <p>
 * Created on: 2018-12-09
 */

@Repository
public interface HotelRepository extends MongoRepository<Hotel, String> {

    List<Hotel> findByPricePerNightLessThan(int maxPrice);

    @Query(value = "{ 'address.city' : ?0 }")
    List<Hotel> findByCity(String city);
}
