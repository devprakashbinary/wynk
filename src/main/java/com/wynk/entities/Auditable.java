package com.wynk.entities;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.envers.Audited;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonView;
import com.wynk.views.AuditableViews.AuditableBasicView;
import com.wynk.views.AuditableViews.AuditableLastModifiedView;
import com.wynk.views.AuditableViews.AuditableView;

import lombok.Getter;
import lombok.Setter;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@Getter 
@Setter
@Audited
public abstract class Auditable<T> {

    @CreatedBy
    @ManyToOne
    @JsonView({AuditableView.class})
    protected T createdBy;

    @CreatedDate
    @Column(updatable=false)
    @Temporal(TemporalType.TIMESTAMP)
    @JsonView({AuditableBasicView.class})
    protected Date creationDate;

    @LastModifiedBy
    @ManyToOne
    @JsonView({AuditableLastModifiedView.class})
    protected T lastModifiedBy;

    @JsonView({AuditableLastModifiedView.class})
    @LastModifiedDate
    @Temporal(TemporalType.TIMESTAMP)
    protected Date lastModifiedDate;
}