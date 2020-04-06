package com.decathlon.competition.domain;

import lombok.Data;
import lombok.NonNull;

@Data
public class Results {

  @NonNull
  private String name;
  @NonNull
  private Double result;

}
