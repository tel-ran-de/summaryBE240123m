package summary8.project1.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ToDoDTO {

    private Integer id;
    private String name;
    private String description;
}
