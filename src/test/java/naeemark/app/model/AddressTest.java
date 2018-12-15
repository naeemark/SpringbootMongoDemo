package naeemark.app.model;

import naeemark.Address;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Naeem <naeemark@gmail.com>.
 * <p>
 * Created on: 2018-12-15
 */
public class AddressTest {


    @Test
    public void testCreation() {

        Address address = new Address("KL", "ML");
        Assert.assertEquals("KL", address.getCity());

    }
}
