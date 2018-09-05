package com.example.postgres.repository;

import com.example.postgres.model.Answer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Package: com.example.postgres.repository
 * @auther: YuAn
 * @Date: 2018/8/31
 * @Time: 15:04
 * @Project_name: postgres
 * To change this template use File | Settings | File Templates.
 * @Description:
 */

@Repository
public interface AnswerRepository extends JpaRepository<Answer, Long> {

    List<Answer> findByQuestionId(Long questionId);

}
