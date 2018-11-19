package com.hua.springcloud.entites;

/**
 * @Author hua
 * @Version 2018/10/31
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * Dept(Entity) orm mysql->Dept(table)类表关系映射
 */
@AllArgsConstructor//全参
@NoArgsConstructor//无参
@Data//生成set和get
@Accessors(chain = true)//链式写法，就是set之后接着set
public class Dept implements Serializable {

    private Long deptno;//主键
    private String dname;
    private String db_source;//来自哪个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库

    public Dept(String dname){
        super();
        this.dname=dname;
    }

}
