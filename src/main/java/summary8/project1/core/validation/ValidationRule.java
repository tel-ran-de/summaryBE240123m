package summary8.project1.core.validation;


import summary8.project1.dto.AddToDoRequest;

public interface ValidationRule {

    void validate(AddToDoRequest request);

}
