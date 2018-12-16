package naeemark.utils;

import naeemark.Address;
import naeemark.Hotel;
import naeemark.Review;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Naeem <naeemark@gmail.com>.
 * <p>
 * Created on: 2018-12-16
 */
public class Utils {

    private Utils(){}

    public static List<Hotel> getHotelsList() {

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
        return Arrays.asList(marriot, ibis, sofitel);
    }
}
