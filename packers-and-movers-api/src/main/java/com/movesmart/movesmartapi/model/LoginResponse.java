package com.movesmart.movesmartapi.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class LoginResponse {

  private String id;
  private String role;
  private String name;
  private String email;

}