package com.lmt.jpa.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @description 演示用户表
 *
 * @author bazhandao
 * @date 2022/1/16 16:10
 * @since JDK1.8
 */
@Getter
@Setter
@ToString(callSuper = true)
@Entity
@Table(name = "t_demo_user")
public class User {

    @Id
    private Long id;

    private String username;

    @Column(name = "total_amount")
    private BigDecimal totalAmount;

    private Integer status;

    @Column(name = "created_time")
    private Date createdTime;

}
