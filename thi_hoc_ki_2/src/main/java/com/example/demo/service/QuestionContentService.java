package com.example.demo.service;

import com.example.demo.model.QuestionContent;
import com.example.demo.repository.IQuestionContentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class QuestionContentService implements IQuestionContentService {
    @Autowired
    private IQuestionContentRepository questionContentRepository;

    @Override
    public void save(QuestionContent questionContent) {
        questionContentRepository.save(questionContent);
    }

    @Override
    public void remove(int id) {
        questionContentRepository.deleteById(id);
    }

    @Override
    public QuestionContent findById(int id) {
        return questionContentRepository.findById(id).get();
    }

    @Override
    public List<QuestionContent> findAll() {
        return questionContentRepository.findAll();
    }

    @Override
    public Page<QuestionContent> findAll(Pageable pageable) {
        return questionContentRepository.findAll(pageable);
    }
}
