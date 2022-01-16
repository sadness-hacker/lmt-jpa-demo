package com.lmt.jpa.repository;

import com.lmt.jpa.dto.UserDto;
import com.lmt.jpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @description 演示用户仓库
 *
 * @author bazhandao
 * @date 2022/1/16 16:18
 * @since JDK1.8
 */
public interface UserRepository extends JpaRepository<User, Long> {

    /**
     * findUserDto参加UserDto类
     * @author bazhandao
     * @date 2022-01-16
     * @return
     */
    @Query(name = "findUserDto", nativeQuery = true)
    List<UserDto> findUserDto();

}
