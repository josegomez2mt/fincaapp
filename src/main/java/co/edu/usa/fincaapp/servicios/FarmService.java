package co.edu.usa.fincaapp.servicios;

import java.util.List;
import java.util.Optional;

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

    public Optional<Farm> getFarm(Long id){
        return farmRepository.getFarmById(id);
    }

    public Farm saveFarm(Farm farm){
        return farmRepository.saveFarm(farm);
    }

    public void deleteAll(){
        farmRepository.deleteAll();
    }

    public void delete(Long id){
        Optional<Farm> oFarm = getFarm(id);
        if (!oFarm.isEmpty()){
            farmRepository.deleteFarm(oFarm.get());                        
        }        
    }


}
