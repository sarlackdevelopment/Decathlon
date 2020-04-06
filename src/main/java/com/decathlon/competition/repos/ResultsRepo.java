package com.decathlon.competition.repos;

import com.decathlon.competition.domain.Competitor;
import com.decathlon.competition.domain.Results;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Component;

@Component
public class ResultsRepo {
  public static Map<Competitor, List<Results>> getResults() {
    return new HashMap<>() {{

      put(
          new Competitor("John Smith"),
          Arrays.asList(
              new Results("m100",         12.61),
              new Results("longJump",     5.00),
              new Results("shotPut",      9.22),
              new Results("highJump",     1.50),
              new Results("m400",         60.39),
              new Results("hurdlesM110",  16.43),
              new Results("DiscusThrow",  21.60),
              new Results("PoleVault",    2.60),
              new Results("JavelinThrow", 35.81),
              new Results("m1500",        5.25)
          )
      );

      put(
          new Competitor("Jane Doe"),
          Arrays.asList(
              new Results("m100",         13.04),
              new Results("longJump",     4.53),
              new Results("shotPut",      7.79),
              new Results("highJump",     1.55),
              new Results("m400",         64.72),
              new Results("hurdlesM110",  18.74),
              new Results("DiscusThrow",  24.20),
              new Results("PoleVault",    2.40),
              new Results("JavelinThrow", 28.20),
              new Results("m1500",        6.50)
          )
      );

      put(
          new Competitor("Jaan Lepp"),
          Arrays.asList(
              new Results("m100",         13.75),
              new Results("longJump",     4.84),
              new Results("shotPut",      10.12),
              new Results("highJump",     1.50),
              new Results("m400",         68.44),
              new Results("hurdlesM110",  19.18),
              new Results("DiscusThrow",  30.85),
              new Results("PoleVault",    2.80),
              new Results("JavelinThrow", 33.88),
              new Results("m1500",        6.22)
          )
      );

      put(
          new Competitor("Foo Bar"),
          Arrays.asList(
              new Results("m100",         13.43),
              new Results("longJump",     4.35),
              new Results("shotPut",      8.64),
              new Results("highJump",     1.50),
              new Results("m400",         66.06),
              new Results("hurdlesM110",  19.05),
              new Results("DiscusThrow",  24.89),
              new Results("PoleVault",    2.20),
              new Results("JavelinThrow", 33.48),
              new Results("m1500",        6.51)
          )
      );

    }};
  }
}
