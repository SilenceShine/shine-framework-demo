package io.github.SilenceShine.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import io.github.SilenceShine.shine.orm.mybatis.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;

/**
 * @author SilenceShine
 * @github <a href="https://github.com/SilenceShine">SilenceShine</a>
 * @since 1.0
 */
@Getter
@Setter
@TableName("test")
public class Test extends BaseEntity {

    String name;

}
