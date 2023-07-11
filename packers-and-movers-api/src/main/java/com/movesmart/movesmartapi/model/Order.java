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
@Table(name = "Orders")
public class Order {

  @Id
  @GeneratedValue(generator = "uuid2")
  @GenericGenerator(name = "uuid2", strategy = "uuid2")
  @Column(name = "id")
  public String id;
  @OneToOne
  public User orderedBy;
  @OneToOne
  public Packer packer;
  @OneToOne
  public Quotation quotation;
  @Column(name = "status")
  public String status;
  @Column(name = "patment_status")
  public String paymentStatus;
  @Column(name = "date")
  public String date;

}