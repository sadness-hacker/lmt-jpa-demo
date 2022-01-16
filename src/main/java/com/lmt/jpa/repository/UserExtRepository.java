package com.lmt.jpa.repository;

import com.lmt.jpa.entity.UserExt;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @description 用户扩展信息仓库
 *
 * @author bazhandao
 * @date 2022/1/16 16:18
 * @since JDK1.8
 */
public interface UserExtRepository extends JpaRepository<UserExt, Long> {

}
