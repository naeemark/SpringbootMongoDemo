package naeemark;

import naeemark.utils.Utils;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Naeem <naeemark@gmail.com>.
 * <p>
 * Created on: 2018-12-09
 */

@Component
public class DbSeeder implements CommandLineRunner {

    private HotelRepository hotelRepository;

    public DbSeeder(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    @Override
    public void run(String... args) {

        // Drop data first
        this.hotelRepository.deleteAll();

        // create list of hotels
        List<Hotel> hotels = Utils.getHotelsList();

        // Save to database
        this.hotelRepository.saveAll(hotels);
    }
}
