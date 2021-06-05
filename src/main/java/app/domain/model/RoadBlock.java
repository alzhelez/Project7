package app.domain.model;


import app.domain.DTO.TrafficLightState;
import com.sun.istack.Nullable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity(name="roadblocks")
@NoArgsConstructor
public class RoadBlock {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @Nullable
    private RoadBlock leftBlock;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @Nullable
    private RoadBlock centerBlock;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @Nullable
    private RoadBlock rightBlock;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @Nullable
    private Automobile automobile;

    @Column(name = "trafficLightState", nullable = false)
    @Enumerated(EnumType.ORDINAL)
    private TrafficLightState trafficLightState;

    private Boolean isCircle;

    @Override
    public String toString() {
        return "RoadBlock{" +
                "id=" + id +
                ", leftBlockId=" + (leftBlock == null ? "none" : leftBlock.getId()) +
                ", centerBlockId=" + (centerBlock == null ? "none" : centerBlock.getId()) +
                ", rightBlockId=" + (rightBlock == null ? "none" : rightBlock.getId()) +
                ", automobileId=" + (automobile == null ? "none" : automobile.getId()) +
                ", trafficLightState=" + trafficLightState +
                ", isCircle=" + isCircle +
                '}';
    }
}
