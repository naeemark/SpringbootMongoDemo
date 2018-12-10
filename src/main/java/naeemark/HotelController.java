package naeemark;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * Created by Naeem <naeemark@gmail.com>.
 * <p>
 * Created on: 2018-12-09
 */

@RestController
@RequestMapping("/hotels")
public class HotelController {

    private static final Logger logger = LoggerFactory.getLogger(HotelController.class);

    private HotelRepository hotelRepository;

    public HotelController(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    @GetMapping()
    public List<Hotel> getAllHotels(){

        List<Hotel> hotelList = this.hotelRepository.findAll();

        return hotelList;
    }

    @GetMapping("/{id}")
    public Hotel getHotel(@PathVariable("id") String id){

        Optional<Hotel> hotelOptional = this.hotelRepository.findById(id);
        return hotelOptional.get();
    }

    @PostMapping
    public void insertHotel(@RequestBody  Hotel hotel){

        this.hotelRepository.insert(hotel);
    }

    @PutMapping
    public void updateHotel(@RequestBody Hotel hotel){

        this.hotelRepository.save(hotel);
    }

    @DeleteMapping("/{id}")
    public void deleteHotel(@PathVariable("id") String id){

        this.hotelRepository.deleteById(id);
    }

    @GetMapping("/maxPrice/{maxPrice}")
    public List<Hotel> findByPricePerNightLessThan(@PathVariable("maxPrice") int maxPrice){

        List<Hotel> hotels = this.hotelRepository.findByPricePerNightLessThan(maxPrice);
        return hotels;
    }

    @GetMapping("/address/{city}")
    public List<Hotel> findByCity(@PathVariable("city") String city){

        logger.warn(city);
        List<Hotel> hotels = this.hotelRepository.findByCity(city);
        return hotels;
    }
}
