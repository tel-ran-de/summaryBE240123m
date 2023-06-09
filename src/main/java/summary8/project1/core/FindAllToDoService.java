package summary8.project1.core;



import summary8.project1.core.validation.CoreError;
import summary8.project1.domain.ToDoEntity;
import summary8.project1.dto.FindAllToDoResponse;
import summary8.project1.dto.ToDoDTO;
import summary8.project1.repository.ToDoRepository;

import java.util.ArrayList;
import java.util.List;

public class FindAllToDoService {
    private ToDoRepository repository;

    public FindAllToDoService(ToDoRepository repository) {
        this.repository = repository;
    }

    public FindAllToDoResponse findAll() {


        List<ToDoEntity> entities = repository.findAll();
        List<ToDoDTO> dtos = new ArrayList<>();
        List<CoreError> errors = new ArrayList<>();

        if (entities == null || entities.isEmpty()) {
            errors.add(new CoreError("ToDo database is null"));
            }
        else {
            for (int i = 0; i < entities.size(); i++) {
                dtos.add(convert(entities.get(i)));

            }
        }

        return  new FindAllToDoResponse(dtos, errors);
    }

    private ToDoDTO convert(ToDoEntity entity) {
        return new ToDoDTO(entity.getId(), entity.getName(), entity.getDescription());
    }
}
