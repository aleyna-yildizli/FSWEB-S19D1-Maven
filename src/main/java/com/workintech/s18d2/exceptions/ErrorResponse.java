package com.workintech.s18d2.exceptions;

import java.time.LocalDateTime;

public record ErrorResponse(Integer status, String message, LocalDateTime dateTime) {

}
