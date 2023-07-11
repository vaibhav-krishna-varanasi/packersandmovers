package com.movesmart.movesmartapi.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
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
@Table(name = "Feedback")
public class Feedback {

  @Id
  @GeneratedValue(generator = "uuid2")
  @GenericGenerator(name = "uuid2", strategy = "uuid2")
  @Column(name = "id")
  public String id;
  @OneToOne
  public User user;
  @OneToOne
  public Packer packer;
  @Column(name = "description")
  public String description;
  @Column(name = "date")
  public String date;
  @Column(name = "rating")
  public String rating;

}