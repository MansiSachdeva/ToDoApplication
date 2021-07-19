package schemaobject;

import java.time.LocalDateTime;
import java.util.List;

import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class ErrorResponse {

    private String path;
    private int code;
    private String status;
    private String message;
    private LocalDateTime timestamp;
    private List<FieldError> errors;
}
