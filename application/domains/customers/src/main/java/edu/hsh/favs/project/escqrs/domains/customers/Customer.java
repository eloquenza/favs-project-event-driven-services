package edu.hsh.favs.project.escqrs.domains.customers;

import java.io.Serializable;
import java.util.Objects;
import org.javers.core.metamodel.annotation.ValueObject;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@ValueObject
@Table(value = "customers")
public class Customer implements Serializable {

  @Column(value = "username")
  private String username;

  @Column(value = "first_name")
  private String firstName;

  @Column(value = "last_name")
  private String lastName;

  @Column(value = "age")
  private Integer age;

  @Id private Long id;

  public Customer() {}

  public Customer(String username, String firstName, String lastName, int age, Long id) {
    this.username = username;
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public Customer setUsername(String username) {
    this.username = username;
    return this;
  }

  public String getFirstName() {
    return firstName;
  }

  public Customer setFirstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  public String getLastName() {
    return lastName;
  }

  public Customer setLastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  public Integer getAge() {
    return age;
  }

  public Customer setAge(Integer age) {
    this.age = age;
    return this;
  }

  public Long getId() {
    return id;
  }

  public Customer setId(Long id) {
    this.id = id;
    return this;
  }

  @Override
  public String toString() {
    return "Customer{"
        + "username='"
        + username
        + '\''
        + ", firstName='"
        + firstName
        + '\''
        + ", lastName='"
        + lastName
        + '\''
        + ", age="
        + age
        + ", id="
        + id
        + '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Customer)) {
      return false;
    }
    Customer customer = (Customer) o;
    return getAge() == customer.getAge()
        && getUsername().equals(customer.getUsername())
        && getFirstName().equals(customer.getFirstName())
        && getLastName().equals(customer.getLastName())
        && getId().equals(customer.getId());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getUsername(), getFirstName(), getLastName(), getAge(), getId());
  }
}
