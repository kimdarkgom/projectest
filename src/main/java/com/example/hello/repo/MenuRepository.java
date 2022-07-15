package com.example.hello.repo;

import com.example.hello.vo.MenuVo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MenuRepository extends JpaRepository<MenuVo, Long> {
    @Query(value ="SELECT * From tb_menu ORDER BY RAND() LIMIT 1", nativeQuery=true)
    List<MenuVo> findRandMenu();

}
