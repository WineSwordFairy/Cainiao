package core.mapper;

import core.Mail;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * CREATED BY linhuaguo IN 2021-09
 */
@Mapper
public interface CainiaoMapper {
    @Insert("insert into mail (name,target,phone,type) VALUES (#{name}, #{target}, #{phone}, #{type})")
    Integer insert(Mail mail);

    @Select("SELECT * FROM mail WHERE ID = #{id}")
    Mail queryById(int id);
}
