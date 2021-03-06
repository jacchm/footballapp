package jacchm.footballapp.mapping.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class CompetitionDTO {

    private Integer id;
    private AreaDTO area;
    private String name;
    private String code;
    private String ensignUrl;
    private String plan;
    private SeasonDTO currentSeason;
    private Integer numberOfAvailableSeasons;
    private LocalDateTime lastUpdated;

}
