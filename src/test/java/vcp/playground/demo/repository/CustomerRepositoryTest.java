package vcp.playground.demo.repository;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import vcp.playground.demo.entity.Customer;

import java.util.List;

import static java.util.Arrays.asList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.BDDMockito.given;

@ExtendWith(MockitoExtension.class)
class CustomerRepositoryTest {

  @Mock
  private CustomerRepository repository;

  @Test
  void fetchAllCustomers() {

    //Given
    given(repository.findAll()).
        willReturn(asList(
            Customer.builder().firstName("xxx").build(),
            Customer.builder().firstName("abc").build()));

    //When
    List<Customer> actual = repository.findAll();

    //Then
    assertThat(actual.size(), is(2));
  }

  @Test
  void fetchCustomersByFirstName() {

    //Given
    given(repository.findByFirstName(anyString())).
        willReturn(asList(
            Customer.builder().firstName("John").lastName("Doe").build(),
            Customer.builder().firstName("John").lastName("Wick").build()
        ));

    //When
    List<Customer> actual = repository.findByFirstName("John");

    //Then
    assertAll(
        () -> assertThat(actual.size(), is(2)),
        () -> assertThat(actual.get(0).getLastName(), is("Doe"))
    );
  }

}