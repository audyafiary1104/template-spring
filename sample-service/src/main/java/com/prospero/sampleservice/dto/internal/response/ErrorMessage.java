package com.prospero.sampleservice.dto.internal.response;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ErrorMessage {
    private String code;
    private String message;
}
