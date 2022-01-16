package com.lmt.jpa.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @description 测试Dto
 *
 * @author bazhandao
 * @date 2022/1/16 16:14
 * @since JDK1.8
 */
@SqlResultSetMapping(
        name = "userDto",
        entities = {
                @EntityResult(
                        entityClass = UserDto.class, // 当前类名
                        fields = {
                                @FieldResult(name = "id", column = "id"),
                                @FieldResult(name = "username", column = "username"),
                                @FieldResult(name = "totalAmount", column = "total_amount"),
                                @FieldResult(name = "status", column = "status"),
                                @FieldResult(name = "createdTime", column = "created_time"),
                                @FieldResult(name = "country", column = "country"),
                                @FieldResult(name = "province", column = "province"),
                                @FieldResult(name = "address", column = "address")
                        }
                )
        }
)
@NamedNativeQuery(name = "findUserDto", resultSetMapping = "userDto", query = "select * from t_demo_user u left join t_demo_user_ext ue on u.id =ue.id")
@Getter
@Setter
@ToString(callSuper = true)
@Entity
public class UserDto {

    @Id
    private Long id;

    private String username;

    private BigDecimal totalAmount;

    private Integer status;

    private Date createdTime;

    private String country;

    private String province;

    private String address;

}
