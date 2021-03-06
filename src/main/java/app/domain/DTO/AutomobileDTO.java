package app.domain.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AutomobileDTO {

    private Long id;
    private Integer speed;
    private DriveModel driveModel;
    private RoadBlockDTO roadBlock;
    private Boolean hasTurned = false;

    public AutomobileDTO(Integer speed, DriveModel driveModel, RoadBlockDTO roadBlock) {
        this.speed = speed;
        this.driveModel = driveModel;
        this.roadBlock = roadBlock;
    }

}
