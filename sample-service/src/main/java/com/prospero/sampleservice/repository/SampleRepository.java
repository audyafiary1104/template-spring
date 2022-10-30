package com.prospero.sampleservice.repository;

import com.prospero.sampleservice.entity.SampleEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.querydsl.binding.QuerydslPredicate;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.awt.print.Pageable;

@Repository
public interface SampleRepository extends JpaRepository<SampleEntity,Long> , JpaSpecificationExecutor<SampleEntity>{
}
