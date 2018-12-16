package naeemark;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Created by Naeem <naeemark@gmail.com>.
 * <p>
 * Created on: 2018-12-09
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Address {

    private String city;
    private String country;
}
