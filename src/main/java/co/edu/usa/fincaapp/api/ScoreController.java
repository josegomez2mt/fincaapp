package co.edu.usa.fincaapp.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.usa.fincaapp.entidades.Score;
import co.edu.usa.fincaapp.servicios.ScoreService;

@RestController
@RequestMapping("api/Score")
@CrossOrigin(origins = "*")
public class ScoreController {
    @Autowired
    private ScoreService scoreService;

    @GetMapping("/all")
    public List<Score> getScores(){
        return scoreService.getScores();
    }

    @PostMapping("/save")
    public Score saveScore(@RequestBody Score score){
        Score scoreSave = scoreService.saveScore(score);
        return scoreSave;
    }
}
