package naeemark;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
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

        Hotel marriot = new Hotel(
                "Marriot",
                130,
                new Address("Paris", "France"),
                Arrays.asList(
                        new Review("John", 8, false),
                        new Review("Mary", 6, true)
                ));

        Hotel ibis = new Hotel(
                "Ibis",
                90,
                new Address("Bucharest", "Romania"),
                Arrays.asList(
                        new Review("Ted", 9, true),
                        new Review("Hena", 3, true)
                ));

        Hotel sofitel = new Hotel(
                "Sofitel",
                200,
                new Address("Rome", "Itly"),
                Arrays.asList(
                        new Review("Andrew", 7, true),
                        new Review("Telly", 3, true)
                ));

        // Drop data first
        this.hotelRepository.deleteAll();

        // create list of hotels
        List<Hotel> hotels = Arrays.asList(marriot, ibis, sofitel);

        // Save to database
        this.hotelRepository.saveAll(hotels);
    }
}
