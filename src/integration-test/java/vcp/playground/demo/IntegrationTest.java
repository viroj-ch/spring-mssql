package vcp.playground.demo;

import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;
import vcp.playground.demo.support.AzureSqlDatabaseExtension;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ExtendWith(AzureSqlDatabaseExtension.class)
@AutoConfigureTestDatabase(replace = Replace.NONE)
@AutoConfigureMockMvc
@ActiveProfiles("test")
public class IntegrationTest {

  @Autowired
  protected MockMvc mockMvc;

}
