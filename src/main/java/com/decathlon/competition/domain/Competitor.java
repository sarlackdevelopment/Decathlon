package com.decathlon.competition.domain;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
@Builder
public class Competitor {

  @NonNull
  private long id;
  @NonNull
  private String name;

}
