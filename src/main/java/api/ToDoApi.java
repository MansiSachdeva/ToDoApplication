package api;

import java.util.List;

import org.springframework.http.ResponseEntity;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import schemaobject.ErrorResponse;
import schemaobject.TaskSO;

@Tag(name = "Tasks", description = "The Tasks APIs")
public interface ToDoApi {



    @Operation(summary = "Find all tasks", description = "Find all tasks for current user", tags = { "Tasks" })
    @ApiResponses(
            value = {
                @ApiResponse(responseCode = "200", description = "Success", content = @Content(schema = @Schema(implementation = TaskSO.class))),
                @ApiResponse(responseCode = "401", description = "Unauthorized")
            })
    ResponseEntity<List<TaskSO>> findByUsername();





    @Operation(summary = "Create a new tasks", description = "Create a new task for the current user", tags = { "Tasks" })
    @ApiResponses(
            value = {
                    @ApiResponse(responseCode = "200", description = "Success", content = @Content(schema = @Schema(implementation = TaskSO.class))),
                    @ApiResponse(responseCode = "400", description = "Validation Error", content = @Content(schema = @Schema(implementation = ErrorResponse.class)))
            })
    ResponseEntity<TaskSO> create(TaskSO taskSO);
}