package com.movesmart.movesmartapi.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "UserDetails")
public class User {

  @Id
  @GeneratedValue(generator = "uuid2")
  @GenericGenerator(name = "uuid2", strategy = "uuid2")
  @Column(name = "id")
  public String id;
  @Column(name = "name")
  public String name;
  @Column(name = "email", unique = true)
  public String email;
  @Column(name = "phone_no")
  public Long phoneNo;
  @Column(name = "role")
  public String role;
  @Column(name = "password")
  public String password;

}