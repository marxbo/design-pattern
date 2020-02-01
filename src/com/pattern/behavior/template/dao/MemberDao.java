package com.pattern.behavior.template.dao;

import com.pattern.behavior.template.JdbcTemplate;
import com.pattern.behavior.template.entity.Member;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * 人员DAO
 *
 * @author marxbo
 * @version 1.0
 * @date 2020/1/30 15:21
 */
public class MemberDao {

    private JdbcTemplate jdbcTemplate = new JdbcTemplate(null);

    public List<?> query() {
        String sql = "select * from t_member";
        return jdbcTemplate.executeQuery(sql, (rs, rowNum) -> {
            Member m = new Member();
            m.setUsername(rs.getString("username"));
            m.setPassword(rs.getString("password"));
            m.setAge(rs.getInt("age"));
            m.setAddr(rs.getString("addr"));
            return m;
        }, null);
    }

//    @Override
//    public Object processResult(ResultSet rs, int rowNum) throws Exception {
//        Member m = new Member();
//        m.setUsername(rs.getString("username"));
//        m.setPassword(rs.getString("password"));
//        m.setAge(rs.getInt("age"));
//        m.setAddr(rs.getString("addr"));
//        return null;
//    }
}
