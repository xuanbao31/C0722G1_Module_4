package com.example.demo.service;

import com.example.demo.model.QuestionContent;
import com.example.demo.model.QuestionType;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IQuestionTypeService {
    void save(QuestionType questionType);

    void remove(int id);

    QuestionType findById(int id);

List<QuestionType>findAll();

    Page<QuestionType> findAll(Pageable pageable);

}
