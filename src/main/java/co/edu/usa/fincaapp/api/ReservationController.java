package co.edu.usa.fincaapp.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.usa.fincaapp.entidades.Reservation;
import co.edu.usa.fincaapp.servicios.ReservationService;

@RestController
@RequestMapping("api/Reservation")
@CrossOrigin(origins = "*")
public class ReservationController {
    @Autowired
    private ReservationService reservationService;

    @GetMapping("/all")
    public List<Reservation> getReservations(){
        return reservationService.getReservations();
    }

    @PostMapping("/save")
    public Reservation saveReservation(@RequestBody Reservation reservation){
        Reservation reservationSave = reservationService.saveReservation(reservation);
        return reservationSave;
    }
}
