package com.movesmart.movesmartapi.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import java.util.HashSet;
import java.util.Set;
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
@Table(name = "packers")
public class Packer {

  @Id
  @GeneratedValue(generator = "uuid2")
  @GenericGenerator(name = "uuid2", strategy = "uuid2")
  @Column(name = "id")
  public String id;
  @Column(name = "name")
  public String name;
  @Column(name = "email")
  public String email;
  @Column(name = "phone_no")
  public Long phoneNo;
  @Column(name = "description")
  public String description;
  @OneToOne
  public User user;
  @ManyToMany
  @JoinTable(
      name = "packer_service",
      joinColumns = @JoinColumn(name = "packer_id"),
      inverseJoinColumns = @JoinColumn(name = "service_id")
  )
  public Set<ServiceTypes> services = new HashSet<>();
  @Column(name = "city")
  public String city;
  @Column(name = "state")
  public String state;



}