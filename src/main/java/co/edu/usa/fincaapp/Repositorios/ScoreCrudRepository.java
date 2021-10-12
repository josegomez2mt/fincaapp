package co.edu.usa.fincaapp.Repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.edu.usa.fincaapp.entidades.Score;

@Repository
public interface ScoreCrudRepository extends CrudRepository<Score, Long>{
    
}
