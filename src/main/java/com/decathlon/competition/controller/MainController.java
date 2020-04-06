package com.decathlon.competition.controller;

import com.decathlon.competition.service.CalculateSerice;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

  @Autowired
  CalculateSerice calculateSerice;

  @GetMapping("/")
  public String startPage(Map<String, Object> model) {
    calculateSerice.calculate();
    return "start";
  }

}
