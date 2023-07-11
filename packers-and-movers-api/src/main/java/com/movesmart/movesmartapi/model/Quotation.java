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
@Table(name = "quotation")
public class Quotation {

  @Id
  @GeneratedValue(generator = "uuid2")
  @GenericGenerator(name = "uuid2", strategy = "uuid2")
  @Column(name = "id")
  public String id;
  @OneToOne
  public User quotedBy;
  @OneToOne
  public Packer packer;
  @Column(name = "date")
  public String date;
  @OneToOne
  public ServiceTypes serviceType;
  @Column(name = "description")
  public String description;
  @Column(name = "comments")
  public String comments;
  @Column(name = "amount")
  public String amount;
  @Column(name = "status")
  public String status;

}