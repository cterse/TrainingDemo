package com.personal.trainingdemo.entities;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.Date;

@MappedSuperclass
public class BaseEntity {

    @Id
    @SequenceGenerator(name="TRAININGDEMO_ID_GENERATOR", sequenceName="HIBERNATE_TRAININGDEMO_ID_SEQ")
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="TRAININGDEMO_ID_GENERATOR")
    @Column(unique=true, nullable=false, length=30)
    private BigInteger id;

    @Temporal(TemporalType.DATE)
    //@Column(name="CREATE_DATE")
    private Date createDate;

    //@Column(name="CREATED_BY", length=100)
    private String createdBy;

    @Temporal(TemporalType.DATE)
    //@Column(name="LAST_UPDATE_DATE")
    private Date lastUpdateDate;

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }
}
