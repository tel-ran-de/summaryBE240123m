package summary8.project1.core.validation;



import summary8.project1.dto.AddToDoRequest;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class ValidationService {

    private final List<ValidationRule> validationRules;

    public ValidationService(List<ValidationRule> validationRules) {
    this.validationRules = validationRules;
    }


    public List<CoreError> validate(AddToDoRequest request) {
        List<CoreError> errors = new ArrayList<>();
        if (request == null) {
            errors.add(new CoreError("ToDo must not be null"));
            return errors;
        }

        return  validationRules.stream()
                .map(rule -> validate(rule, request))
                .filter(Objects::nonNull)
                .collect(Collectors.toList());
    }

    private CoreError validate(ValidationRule rule, AddToDoRequest request) {
        try {
            rule.validate(request);
        } catch (ValidationException e) {
            return new CoreError(e.getMessage());
        }
        return null;
    }

}
