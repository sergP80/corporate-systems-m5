package ua.edu.chmnu.ki.m5.cs.web.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import ua.edu.chmnu.ki.m5.cs.exceptions.BaseShopException;
import ua.edu.chmnu.ki.m5.cs.exceptions.ProductNotFoundException;
import ua.edu.chmnu.ki.m5.cs.web.dto.ErrorDTO;

@RestControllerAdvice
public class ExceptionApiControllerAdvice extends ResponseEntityExceptionHandler {

    @ExceptionHandler(value = {ProductNotFoundException.class})
    public ResponseEntity<ErrorDTO> handleException(ProductNotFoundException ex) {
        ErrorDTO errorDTO = new ErrorDTO();

        errorDTO.setMessage(ex.getMessage());

        return new ResponseEntity<>(errorDTO, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(value = {BaseShopException.class})
    public ResponseEntity<ErrorDTO> handleException(BaseShopException ex) {
        ErrorDTO errorDTO = new ErrorDTO();

        errorDTO.setMessage(ex.getMessage());

        return new ResponseEntity<>(errorDTO, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(value = {Exception.class})
    public ResponseEntity<ErrorDTO> handleException(Exception ex) {
        ErrorDTO errorDTO = new ErrorDTO();

        errorDTO.setMessage(ex.getMessage());

        return new ResponseEntity<>(errorDTO, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
