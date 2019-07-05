package com.xyy.entity;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @Description
 * @Author Hunter
 * @Date 2019-04-17
 */
@Table(name = "complat_city")
@Entity
public class ComplatCity implements Serializable {

    private static final long serialVersionUID = 7553397155552832518L;

    private String id;
    private String name;
    private String other;
    private ComplatZone complatZone;

    @Override
    public String toString() {
        return "id:" + this.id + "," + "name:" + this.name + "," + "other:" + this.other;
    }

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid.hex")
    @Column(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Column(name = "name")
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //标识other为complat_city中字段，对应complat_zone中iid
    @OneToOne(targetEntity = ComplatZone.class)
    @JoinColumn(name = "other", referencedColumnName = "iid", foreignKey = @ForeignKey(name = "CITY_TO_ZONE_FK"))
    public ComplatZone getComplatZone() {
        return complatZone;
    }

    public void setComplatZone(ComplatZone complatZone) {
        this.complatZone = complatZone;
    }
}
