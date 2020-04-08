package com.decathlon.competition.controller;

import com.decathlon.competition.service.CalculateSerice;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

  @Autowired
  CalculateSerice calculateSerice;

  @GetMapping("/")
  public String startPage(Model model) {
    model.addAttribute("results", calculateSerice.resultsMap());
    model.addAttribute("disciplines", calculateSerice.disciplinesList());
    return "start";
  }

}
