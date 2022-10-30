package com.prospero.sampleservice.dto.internal.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SampleRequest implements Serializable {
    private String name;
    private String email;
    private String username;
}
