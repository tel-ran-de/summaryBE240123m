package summary8.project1.repository;



import summary8.project1.domain.ToDoEntity;

import java.util.List;
import java.util.Optional;

public interface ToDoRepository {

    ToDoEntity save(ToDoEntity entity);

    List<ToDoEntity> findAll();

    Optional<ToDoEntity> findById(Integer id);

}
