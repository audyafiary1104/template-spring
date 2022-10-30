package com.prospero.sampleservice.service.Interface;

import com.prospero.sampleservice.dto.internal.request.SampleRequest;
import com.prospero.sampleservice.entity.SampleEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ISampleEntity {
     void Delete(Long id);
     SampleEntity create(SampleRequest sampleRequest);
     SampleEntity update(Long id,SampleRequest sampleRequest);
    Page<SampleEntity> FetchData(String Search, Pageable pageable);
}
