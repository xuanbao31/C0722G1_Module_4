package com.example.demo.service;

import com.example.demo.model.QuestionType;
import com.example.demo.repository.IQuestionTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionTypeService implements IQuestionTypeService {

    @Autowired
    private IQuestionTypeRepository questionTypeRepository;

    @Override
    public void save(QuestionType questionType) {
        questionTypeRepository.save(questionType);
    }

    @Override
    public void remove(int id) {
        questionTypeRepository.deleteById(id);
    }

    @Override
    public QuestionType findById(int id) {
        return questionTypeRepository.findById(id).get();
    }

    @Override
    public List<QuestionType> findAll() {
        return questionTypeRepository.findAll();
    }


    @Override
    public Page<QuestionType> findAll(Pageable pageable) {
        return questionTypeRepository.findAll(pageable);
    }


}
