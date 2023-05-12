package summary4.dto;

public enum ErrorCode {
    Err_404("Server error:", 404),
    Err_200("Ok",200);

    private String description;
    private int statusCode;

    ErrorCode(String description, int statusCode) {
        this.description = description;
        this.statusCode = statusCode;
    }
}
