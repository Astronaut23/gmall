package com.astronaut.gmall.user.mapper;


import com.astronaut.gmall.user.bean.UserMemeber;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface userMapper {

    @Select("select * from member")
    List<UserMemeber> selectAlluser();
}
