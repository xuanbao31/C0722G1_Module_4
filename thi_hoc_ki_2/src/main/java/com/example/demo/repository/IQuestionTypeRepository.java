package com.example.demo.repository;

import com.example.demo.model.QuestionType;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IQuestionTypeRepository extends JpaRepository<QuestionType,Integer> {

}
