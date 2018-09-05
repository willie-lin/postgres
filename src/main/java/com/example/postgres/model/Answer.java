package com.example.postgres.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @Package: com.example.postgres.model
 * @auther: YuAn
 * @Date: 2018/8/31
 * @Time: 14:57
 * @Project_name: postgres
 * To change this template use File | Settings | File Templates.
 * @Description:
 */

@Data
@Entity
@Table(name = "answers")
public class Answer extends AuditModel{


    @Id
    @GeneratedValue(generator = "answer_generator")
    @SequenceGenerator(name = "answer_generator",
    sequenceName = "answer_sequence",
            initialValue = 1000
    )
    private long id;


    @Column(columnDefinition = "text")
    private String text;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "question_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private Question question;


}
