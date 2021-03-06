package jacchm.footballapp.model.entity;

import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.time.LocalDate;

@Data
@Entity
public class Team implements Serializable {

    private static final long serialVersionUID = 5294003351750241880L;
    @Id
    private Integer id;
    @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
    private Area area;
    private String name;
    private String shortName;
    private String tla;
    private String crestUrl;
    private String address;
    private String phone;
    private String website;
    private String email;
    private String founded;
    private String clubColors;
    private String venue;
    private LocalDate lastUpdated;
    private Integer competitionId;

}
