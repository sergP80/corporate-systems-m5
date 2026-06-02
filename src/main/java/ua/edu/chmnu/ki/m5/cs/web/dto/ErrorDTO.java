package ua.edu.chmnu.ki.m5.cs.web.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ErrorDTO {

    @JsonProperty("message")
    private String message;
}
