package summary8.project1.dto;


import lombok.Data;
import lombok.NoArgsConstructor;
import summary8.project1.core.validation.CoreError;


import java.util.List;

@Data
@NoArgsConstructor
public class AddToDoResponse {
    private Integer createdToDoId;
    private List<CoreError> errors;

}
