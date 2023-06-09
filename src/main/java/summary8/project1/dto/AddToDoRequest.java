package summary8.project1.dto;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AddToDoRequest {
    private String name;
    private String description;

}
