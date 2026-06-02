package ua.edu.chmnu.ki.m5.cs.exceptions;

public class ProductNotFoundException extends BaseShopException {
    public ProductNotFoundException() {
    }

    public ProductNotFoundException(String message) {
        super(message);
    }
}
