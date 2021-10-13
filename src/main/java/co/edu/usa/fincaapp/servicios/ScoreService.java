package co.edu.usa.fincaapp.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.usa.fincaapp.Repositorios.ScoreRepository;
import co.edu.usa.fincaapp.entidades.Score;

@Service
public class ScoreService {
    @Autowired
    public
    ScoreRepository scoreRepository;

    public List<Score> getScores(){
        return scoreRepository.getScores();
    }

    public Score getScore(Long id){
        return scoreRepository.getScoreById(id).get();
    }

    public Score saveScore(Score Score){
        return scoreRepository.saveScore(Score);
    }
    
    public void deleteAll(){
        scoreRepository.deleteAll();
    }
}