package com.example.postgres.model;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 *
 * @Package: com.example.postgres.model
 * @auther: YuAn
 * @Date: 2018/8/31
 * @Time: 14:41
 * @Project_name: postgres
 * To change this template use File | Settings | File Templates.
 * @Description:
 */

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class AuditModel implements Serializable {


    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="create_at", nullable = false, updatable = false)
    @CreatedDate
    private Date createdAt;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated_at", nullable = false)
    @LastModifiedDate
    private Date updatedAt;



}
