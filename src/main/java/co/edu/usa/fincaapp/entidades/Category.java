package co.edu.usa.fincaapp.entidades;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



@Entity
@Table(name="categorys")
public class Category implements Serializable{
    @Id
    @Column(name="id")
    private Long id;
    @Column(name="name", nullable = false, length=45)
    private String name;
    @Column(name="description", nullable = false, length=250)
    private String description;

    @OneToMany(cascade ={CascadeType.PERSIST},mappedBy = "category")
    @JsonIgnoreProperties("category")
    private List<Farm> farms;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Farm> getFarms() {
        return farms;
    }

    public void setFarms(List<Farm> farms) {
        this.farms = farms;
    }

    
        
}
