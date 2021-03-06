package com.sw300.acme.course;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "lo", path = "los")
public interface LearningObjectRepository extends PagingAndSortingRepository<LearningObject, Long> {
}
