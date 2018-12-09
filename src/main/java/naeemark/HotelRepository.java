package naeemark;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Naeem <naeemark@gmail.com>.
 * <p>
 * Created on: 2018-12-09
 */

@Repository
public interface HotelRepository extends MongoRepository<Hotel, String> {
}
