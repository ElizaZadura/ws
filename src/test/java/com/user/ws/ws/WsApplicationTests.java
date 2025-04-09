package com.user.ws.ws;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import model.AppUser;
import model.Details;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;

import java.time.LocalDate;
import java.util.Optional;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class WsApplicationTests {

	@Test
	void contextLoads() {
	}

}
