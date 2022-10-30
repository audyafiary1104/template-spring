package com.prospero.sampleservice.dto.internal.response;

import lombok.Data;

import java.io.Serializable;

@Data
public class pageable implements Serializable {
    private Integer pageNumber;
    private Integer pageSize;
    private Integer totalElements;
}
