package com.example.demo.repository;

import com.example.demo.model.QuestionContent;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IQuestionContentRepository extends JpaRepository<QuestionContent,Integer> {
//@Query(value="select * from question_content where abc = 0",nativeQuery = true)
//    Page<QuestionContent>findAllByAbc(Pageable pageable);
}
