package com.pattern.behavior.template;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Jdbc操作模板抽象类
 *
 * @author marxbo
 * @version 1.0
 * @date 2020/1/30 14:10
 */
public class JdbcTemplate {

    /**
     * 数据源
     */
    private DataSource dataSource;

    public JdbcTemplate(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    /**
     * 获取数据库连接
     *
     * @return 数据库连接
     * @throws SQLException
     */
    private Connection getConnection() throws SQLException {
        return this.dataSource.getConnection();
    }

    /**
     * 创建预编译语句集
     *
     * @param conn 数据库连接
     * @param sql SQL语句
     * @return 预编译语句集
     * @throws SQLException
     */
    private PreparedStatement createPreparedStatement(Connection conn, String sql) throws SQLException {
        return conn.prepareStatement(sql);
    }

    /**
     * 执行查询，获取结果集
     *
     * @param pstmt 预编译语句集
     * @param values 预编译参数
     * @return
     * @throws SQLException
     */
    private ResultSet executeQuery(PreparedStatement pstmt, Object[] values) throws SQLException {
        for (int i = 1; i < values.length; i++) {
            pstmt.setObject(i, values[i]);
        }
        return pstmt.executeQuery();
    }

    /**
     * 关闭结果集
     *
     * @param rs 结果集
     * @throws SQLException
     */
    public void closeResultSet(ResultSet rs) throws SQLException {
        rs.close();
    }

    /**
     * 关闭语句集
     *
     * @param stmt 语句集
     * @throws SQLException
     */
    public void closeStatement(Statement stmt) throws SQLException {
        stmt.close();
    }

    /**
     * 关闭数据库连接
     *
     * @param conn 数据库连接
     * @throws SQLException
     */
    public void closeConnection(Connection conn) throws SQLException {
        conn.close();
    }

    /**
     * 解析结果集为List集合
     *
     * @param rs 结果集
     * @param rowMapper 匿名内部类作为参数
     * @return List集合
     * @throws SQLException
     */
    public List<?> parseResultSet(ResultSet rs, RowMapper rowMapper) throws SQLException {
        List<Object> result = new ArrayList<>();
        int rowNum = 1;
        while (rs.next()) {
            // 调用需自己实现的RowMapper接口的mapRow()方法
            result.add(rowMapper.mapRow(rs, rowNum++));
        }
        return result;
    }

    /**
     * 执行查询，获取List集合
     *
     * @param sql SQL语句
     * @param rowMapper 匿名内部类作为参数
     * @param values 查询参数
     * @return
     */
    public List<?> executeQuery(String sql, RowMapper<?> rowMapper, Object[] values) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            // 1、获取数据库连接
            conn = this.getConnection();
            // 2、预编译SQL语句
            pstmt = this.createPreparedStatement(conn, sql);
            // 3、执行查询，获取结果集
            rs = this.executeQuery(pstmt, values);
            // 4、解析结果集
            List<?> result = this.parseResultSet(rs, rowMapper);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            try {
                // 5、关闭结果集
                this.closeResultSet(rs);
                // 6、关闭语句集
                this.closeStatement(pstmt);
                // 7、关闭数据库连接
                this.closeConnection(conn);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 设置单个结果集的各个列到对象的各个属性中
     *
     * @param rs 结果集
     * @param rowNum
     * @return 对象
     * @throws Exception
     */
//    public abstract Object processResult(ResultSet rs, int rowNum) throws Exception;

}
