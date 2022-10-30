package com.prospero.sampleservice.service.Impl;

import com.prospero.sampleservice.dto.internal.request.SampleRequest;
import com.prospero.sampleservice.entity.SampleEntity;
import com.prospero.sampleservice.repository.SampleRepository;
import com.prospero.sampleservice.service.Interface.ISampleEntity;
import io.github.perplexhub.rsql.RSQLJPASupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;


@Service
public class SampleServiceImpl implements ISampleEntity {
    @Autowired
    SampleRepository sampleRepository;

    @Override
    public void Delete(Long id) {

    }

    @Override
    public SampleEntity create(SampleRequest sampleRequest) {
        return null;
    }

    @Override
    public SampleEntity update(Long id, SampleRequest sampleRequest) {
        return null;
    }

    @Override
    public Page<SampleEntity> FetchData(String Search, Pageable pageable) {
        Specification<SampleEntity> spec = RSQLJPASupport.toSpecification(Search);
        Page<SampleEntity> sampleEntities = sampleRepository.findAll(spec,pageable);
       return sampleEntities;
    }


}
