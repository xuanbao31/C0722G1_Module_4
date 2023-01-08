package com.example.demo.service;

import com.example.demo.model.QuestionContent;
import com.example.demo.model.QuestionType;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IQuestionContentService {
    void save(QuestionContent questionContent);

    void remove(int id);

    QuestionContent findById(int id);

    List<QuestionContent> findAll();

    Page<QuestionContent> findAll(Pageable pageable);
}
