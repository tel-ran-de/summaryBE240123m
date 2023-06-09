package summary8.project1.core.validation;


import summary8.project1.dto.AddToDoRequest;

public class ToDoNameNullValidationRule implements ValidationRule{
    @Override
    public void validate(AddToDoRequest request) {
        if (request.getName() == null) {
            throw new ValidationException("ToDo name must not be null");
        }
    }
}
