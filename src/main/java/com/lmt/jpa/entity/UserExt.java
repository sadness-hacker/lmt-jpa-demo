package com.lmt.jpa.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @description User扩展信息
 *
 * @author bazhandao
 * @date 2022/1/16 16:17
 * @since JDK1.8
 */
@Getter
@Setter
@ToString(callSuper = true)
@Entity
@Table(name = "t_demo_user_ext")
public class UserExt {

    @Id
    private Long id;

    private String country;

    private String province;

    private String address;

}
