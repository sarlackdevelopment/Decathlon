package com.decathlon.competition.controller;

import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

  @GetMapping("/")
  public String startPage(Map<String, Object> model) {
    return "start";
  }

}
