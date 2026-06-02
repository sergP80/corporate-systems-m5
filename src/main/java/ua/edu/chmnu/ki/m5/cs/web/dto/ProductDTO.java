package ua.edu.chmnu.ki.m5.cs.web.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.math.BigDecimal;
import java.net.URL;

@Data
public class ProductDTO {

    @JsonProperty("id")
    private Long id;

    @NotBlank
    @JsonProperty("name")
    private String name;

    private String description;

    private URL image;

    @NotNull
    @JsonProperty("price")
    private BigDecimal price;

    @NotNull
    @JsonProperty("active")
    private Boolean active;
}
