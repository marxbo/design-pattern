package com.pattern.behavior.template;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 映射接口
 *
 * @author marxbo
 * @version 1.0
 * @date 2020/1/31 17:05
 */
public interface RowMapper<T> {

    /**
     * 行映射
     *
     * @param rs 结果集
     * @param rowNum 行数
     * @return
     * @throws SQLException
     */
    T mapRow(ResultSet rs, int rowNum) throws SQLException;

}
