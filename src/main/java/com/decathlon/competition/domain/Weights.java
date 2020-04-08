package com.decathlon.competition.domain;

import lombok.Data;
import lombok.NonNull;

@Data
public class Weights {

  // ( from the proposed article's table https://en.wikipedia.org/wiki/Decathlon, according to formula  y = a * |x - b|^c )

  @NonNull
  private Double weightA;

  @NonNull
  private Double weightB;

  @NonNull
  private Double weightC;

}
