package naeemark;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Naeem <naeemark@gmail.com>.
 * <p>
 * Created on: 2018-12-09
 */

@RestController
@RequestMapping("/hotels")
public class HotelController {

    private HotelRepository hotelRepository;

    public HotelController(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    @GetMapping()
    public List<Hotel> getAllHotels(){

        List<Hotel> hotelList = this.hotelRepository.findAll();

        return hotelList;
    }
}
