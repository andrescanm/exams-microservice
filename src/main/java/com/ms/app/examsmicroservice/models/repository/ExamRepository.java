package com.ms.app.examsmicroservice.models.repository;

import org.springframework.data.repository.CrudRepository;

import com.ms.app.examsmicroservice.models.entity.Exam;

public interface ExamRepository extends CrudRepository<Exam, Long> {

}
