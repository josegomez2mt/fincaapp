package co.edu.usa.fincaapp.entidades;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.ForeignKey;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="reservations")
public class Reservation implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name="client", foreignKey = @ForeignKey(name = "fk_ReservationClient"))
    @JsonIgnoreProperties("reservations")
    private Client client;
    
    @ManyToOne
    @JoinColumn(name="farm", foreignKey = @ForeignKey(name = "fk_ReservationFarm"))
    @JsonIgnoreProperties("reservations")
    private Farm farm;

    @OneToMany(cascade ={CascadeType.PERSIST},mappedBy = "reservation")
    @JsonIgnoreProperties("scores")
    private List<Score> scores;
    
    @Column(name="startDate")
    private Date startDate;

    @Column(name="devolutionDate")
    private Date devolutionDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Farm getFarm() {
        return farm;
    }

    public void setFarm(Farm farm) {
        this.farm = farm;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getDevolutionDate() {
        return devolutionDate;
    }

    public void setDevolutionDate(Date devolutionDate) {
        this.devolutionDate = devolutionDate;
    }

    public List<Score> getScores() {
        return scores;
    }

    public void setScores(List<Score> scores) {
        this.scores = scores;
    }
 

    
}
