package com.scs.soft.zhihu.api.mapper;

import com.scs.soft.zhihu.api.entity.RoundTable;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * @author CRQ
 */
public interface RoundTableMapper {


/**
 * 查询所有圆桌页
 * @return List</Map>
 */
@Select("SELECT * FROM t_round_table")
    @Results({
            @Result(id=true,property="roundTableId",column="id",javaType = String.class),
            @Result(property="name",column="name",javaType = String.class),
            @Result(property = "banner",column="banner",javaType=String.class),
            @Result(property = "tinyBanner",column="tiny_banner",javaType=String.class),
            @Result(property = "urlToken",column="url_token",javaType=String.class),
            @Result(property = "visitsCount",column="visits_count",javaType=Integer.class),
            @Result(property = "includeCount",column="include_count",javaType=Integer.class)
    })
 List<Map> selectAll();

    /**
     * 查询最新专题
     * @return
     */
    @Select("SELECT * FROM t_round_table LIMIT 0,4")
    List<RoundTable> selectRecent();

}
