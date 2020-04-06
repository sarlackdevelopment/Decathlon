package com.decathlon.competition.domain;

import lombok.Data;
import lombok.NonNull;

@Data
public class Competitor {

  @NonNull
  private String name;

}
