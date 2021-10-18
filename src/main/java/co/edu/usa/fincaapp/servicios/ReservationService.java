package co.edu.usa.fincaapp.servicios;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.usa.fincaapp.Repositorios.ReservationRepository;
import co.edu.usa.fincaapp.entidades.Reservation;

@Service
public class ReservationService {
    @Autowired
    public
    ReservationRepository reservationRepository;

    public List<Reservation> getReservations(){
        return reservationRepository.getReservations();
    }

    public Optional<Reservation> getReservation(Long id){
        return reservationRepository.getReservationById(id);
    }

    public Reservation saveReservation(Reservation reservation){
        return reservationRepository.saveReservation(reservation);
    }
    
    public void deleteAll(){
        reservationRepository.deleteAll();
    }

    public void delete(Long id){
        Optional<Reservation> oReservation = getReservation(id);
        if (!oReservation.isEmpty()){
            reservationRepository.deleteReservation(oReservation.get());                        
        }        
    }
}
