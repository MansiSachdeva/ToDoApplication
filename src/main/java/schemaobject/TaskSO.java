package schemaobject;

import java.time.LocalDateTime;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class TaskSO {


    @Schema( example = "Order Pizza", description = "Tile of the task", required = true)
    @NotNull( message = "{taskDto.title.null}")
    @NotEmpty( message = "Task title can't be empty.")
    private String title;
    private String category;
    private String status;

    @Schema( example = "2021-07-13T15:36:24.699Z", description = "Task created time", required = false)
    private LocalDateTime createdOn;

    @Schema( example = "2021-07-13T15:36:24.699Z", description = "Task last modified time", required = false)
    private LocalDateTime modifiedOn;
}
