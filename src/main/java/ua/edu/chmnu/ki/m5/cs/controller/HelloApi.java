package ua.edu.chmnu.ki.m5.cs.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.validation.annotation.Validated;

@Validated
@Tag(name = "Hello")
public interface HelloApi {

    String ping(String payload);
}
