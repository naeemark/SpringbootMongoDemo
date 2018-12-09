package naeemark;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Naeem <naeemark@gmail.com>.
 * <p>
 * Created on: 2018-12-09
 */

@Document(collection = "Hotels")
public class Hotel {

    @Id
    private String id;
    private String name;

    @Indexed(direction = IndexDirection.ASCENDING)
    private int pricePerNight;
    private Address address;
    private List<Review> reviews;

    protected Hotel() {
        this.reviews = new ArrayList<>();
    }

    public Hotel(String name, int pricePerNight, Address address, List<Review> reviews) {
        this.name = name;
        this.pricePerNight = pricePerNight;
        this.address = address;
        this.reviews = reviews;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPricePerNight() {
        return pricePerNight;
    }

    public Address getAddress() {
        return address;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", pricePerNight=" + pricePerNight +
                ", address=" + address +
                ", reviews=" + reviews +
                '}';
    }
}
