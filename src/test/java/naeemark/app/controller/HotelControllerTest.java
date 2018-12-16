package naeemark.app.controller;

import naeemark.Hotel;
import naeemark.HotelController;
import naeemark.HotelRepository;
import naeemark.utils.Utils;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.Collections;

import static org.hamcrest.Matchers.hasSize;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * Created by Naeem <naeemark@gmail.com>.
 * <p>
 * Created on: 2018-12-15
 */
@RunWith(SpringRunner.class)
public class HotelControllerTest {

    private MockMvc mockMvc;

    @Mock
    private HotelRepository hotelRepository;

    @Mock
    private HotelController hotelController;

    @Before
    public void setUp() {
        mockMvc = MockMvcBuilders.standaloneSetup(hotelController).build();
    }

    @Test
    public void testGetHotels() throws Exception {

        when(hotelController.getAllHotels()).thenReturn(Utils.getHotelsList());

        this.mockMvc.perform(get("/hotels"))
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(jsonPath("@.[0]").exists())
                .andExpect(jsonPath("@", hasSize(3)))
                .andExpect(status().isOk());
    }

    @Test
    public void testGet() throws Exception {

        Hotel hotel = new Hotel("Taj", 100, null, null);

        when(hotelController.getAllHotels()).thenReturn(Collections.singletonList(hotel));

        mockMvc.perform(get("/hotels"))
                .andExpect(jsonPath("@.[0]").exists())
                .andExpect(jsonPath("@.[0].id").doesNotExist())
                .andExpect(jsonPath("@.[0].name").exists())
                .andExpect(jsonPath("@.[0].name").value("Taj"))
                .andExpect(status().isOk());

        verify(hotelController).getAllHotels();
    }
}
