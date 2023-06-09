package summary8.project1.core.validation;


import summary8.project1.dto.AddToDoRequest;

public class ToDoDescriptionNullValidationRule implements ValidationRule{
    @Override
    public void validate(AddToDoRequest request) {
        if (request.getDescription() == null) {
            throw new ValidationException("ToDo description must not be null");
        }
    }
}
