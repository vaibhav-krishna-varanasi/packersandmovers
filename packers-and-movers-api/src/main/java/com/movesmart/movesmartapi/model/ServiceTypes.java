package com.movesmart.movesmartapi.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
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
@Table(name = "ServiceTypes")
public class ServiceTypes {

  @Id
  @GeneratedValue(generator = "uuid2")
  @GenericGenerator(name = "uuid2", strategy = "uuid2")
  @Column(name = "id")
  public String id;
  @Column(name = "service_type")
  public String serviceType;
  @Column(name = "is_active", columnDefinition = "BOOLEAN DEFAULT true")
  private boolean isActive = true;
//  @ManyToMany(mappedBy = "services")
//  private Set<Packer> packers = new HashSet<>();


}