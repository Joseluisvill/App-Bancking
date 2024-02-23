package com.consultec.org.banktest.modelo;

public record ResponseGeneric<T>(
boolean Error,
String Mensaje,
T Data
) {
}
