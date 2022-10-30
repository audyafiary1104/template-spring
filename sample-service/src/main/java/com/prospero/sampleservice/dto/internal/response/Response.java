package com.prospero.sampleservice.dto.internal.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Data
@AllArgsConstructor
public class Response<T> {
    public Integer status;
    public Boolean success;
    public List<ErrorMessage> message = new ArrayList<>();
    public T payload;
    public pageable pageable;
}
