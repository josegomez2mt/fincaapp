package co.edu.usa.fincaapp.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.usa.fincaapp.Repositorios.FarmRepository;
import co.edu.usa.fincaapp.entidades.Farm;

@Service
public class FarmService {
    @Autowired
    FarmRepository farmRepository;

    public List<Farm> getFarms(){
        return farmRepository.getFarms();
    }

    public Farm getFarm(Long id){
        return farmRepository.getFarmById(id).get();
    }

    public Farm saveFarm(Farm farm){
        return farmRepository.saveFarm(farm);
    }

}
