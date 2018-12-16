package naeemark.app.model;

import naeemark.Address;
import org.assertj.core.api.Assertions;
import org.hamcrest.Matchers;
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

        Assertions.assertThat(address.getCity()).isNotBlank();
        Assert.assertEquals("KL", address.getCity());
        Assert.assertThat(address.getCity(), Matchers.equalTo("KL"));
        Assertions.assertThat(address.getCity()).isEqualTo("KL");

        Assertions.assertThat(address.getCountry()).isNotBlank();
        Assert.assertEquals("ML", address.getCountry());


    }
}
