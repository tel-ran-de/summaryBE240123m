package summary8.project1.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import summary8.project1.core.validation.CoreError;


import java.util.List;

@Data
@AllArgsConstructor
public class FindAllToDoResponse {
    private List<ToDoDTO> todos;
    private List<CoreError> errors;
}
