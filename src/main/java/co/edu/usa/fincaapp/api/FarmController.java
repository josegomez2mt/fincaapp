package co.edu.usa.fincaapp.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.usa.fincaapp.entidades.Farm;
import co.edu.usa.fincaapp.servicios.FarmService;

@RestController
@RequestMapping("/api/Farm")
@CrossOrigin(origins = "*")
public class FarmController {
    @Autowired
    private FarmService farmService;

    @GetMapping("/all")
    public List<Farm> getFarms(){
        return farmService.getFarms();
    }

    @PostMapping("/save")
    public Farm saveFarm(@RequestBody Farm farm){
        Farm farmSave = farmService.saveFarm(farm);
        return farmSave;
    }

    @DeleteMapping("/deleteAll")
    public void deleteAllFarm(){
        farmService.deleteAll();
    }
}


