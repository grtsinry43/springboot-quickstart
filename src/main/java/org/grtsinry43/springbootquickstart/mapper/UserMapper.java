package org.grtsinry43.springbootquickstart.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.grtsinry43.springbootquickstart.model.User;

/**
 * @Author： grtsinry43
 * @Date： 2024/7/12 下午6:51
 * @Description：少年负壮气，奋烈自有时！
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
    User getByName (String name);
}
