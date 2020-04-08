package com.decathlon.competition.service;

import com.decathlon.competition.domain.Competitor;
import com.decathlon.competition.domain.Disciplines;
import com.decathlon.competition.domain.Results;
import com.decathlon.competition.domain.Weights;
import com.decathlon.competition.repos.ResultsRepo;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CalculateSerice {

  @Autowired
  ResultsRepo resultsRepo;

  public Map<Competitor, List<Results>> resultsMap() {
    return resultsRepo.getResults();
  }

  public List<Disciplines> disciplinesList() {
    return resultsRepo.getDisciplines();
  }

  public List<Weights> weights() { return resultsRepo.getWeights(); }

}
