package summary8.project1.core.validation;


import summary8.project1.dto.AddToDoRequest;

public class ToDoNameMaxLengthValidationRule implements ValidationRule{
    @Override
    public void validate(AddToDoRequest request) {
        if (request.getName().length() > 10) {
            throw new ValidationException("ToDo name length must be " +
                    "less that 10 but actual name length is " +
                    request.getName().length());
        }
    }
}
