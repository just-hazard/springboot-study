package just.hazard.springboot.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
public class HateoasControllerTests {

    @Autowired
    MockMvc mockMvc;

    @Test
    public void hateoas() throws Exception {
        mockMvc.perform(get("/hateoas"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$._links.self").exists())
                .andDo(print());
    }

}
