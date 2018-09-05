package com.example.postgres.repository;

import com.example.postgres.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

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
public interface QuestionRepository extends JpaRepository<Question, Long> {
}
