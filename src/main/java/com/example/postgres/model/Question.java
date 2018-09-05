package com.example.postgres.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * Created with IntelliJ IDEA.
 *
 * @Package: com.example.postgres.model
 * @auther: YuAn
 * @Date: 2018/8/31
 * @Time: 14:51
 * @Project_name: postgres
 * To change this template use File | Settings | File Templates.
 * @Description:
 */

@Data
@Entity
@Table(name = "question")
public class Question extends AuditModel {

    @Id
    @GeneratedValue(generator = "question_generator")
    @SequenceGenerator(name = "question_generator",
    sequenceName = "question_sequence",
            initialValue = 1000
    )
    private long id;


    @NotBlank
    @Size(min = 3, max = 100)
    private String title;

    @Column(columnDefinition = "text")
    private String description;

}
