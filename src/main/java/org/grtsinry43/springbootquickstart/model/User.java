package org.grtsinry43.springbootquickstart.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @Author： grtsinry43
 * @Date： 2024/7/12 下午4:12
 * 用户对象实体类
 */
@Data
@TableName(value = "user")
public class User {
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;

    @TableField(value = "name")
    private String name;

    public User(String name) {
        this.name = name;
    }
}
