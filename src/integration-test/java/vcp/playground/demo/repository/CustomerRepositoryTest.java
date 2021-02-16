package vcp.playground.demo.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import vcp.playground.demo.IntegrationTest;
import vcp.playground.demo.entity.Customer;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertAll;

class CustomerRepositoryTest  extends IntegrationTest {

  @Autowired
  private CustomerRepository repository;

  @Test
  void testFetchAllData() {

    //Given
    //When
    List<Customer> actual = repository.findAll();

    //Then
    assertThat(actual.size(), is(1));
  }

  @Test
  void FetchDataByName() {

    //Given
    //When
    List<Customer> actual = repository.findByFirstName("John");

    //Then
    assertAll(
        () -> assertThat(actual.size(), is(1)),
        () -> assertThat(actual.get(0).getLastName(), is("Wick"))
    );
  }

}