package com.walmart.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class ErrorResponse {

    private int statusCode;
    private String message;

    public ErrorResponse(String message)
    {
        super();
        this.message = message;
    }

	public ErrorResponse(int statusCode, String message) {
		// TODO Auto-generated constructor stub
	}
}