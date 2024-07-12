package com.example.jdbccrud.repository;

import com.example.jdbccrud.entity.Post;
import org.springframework.jdbc.datasource.DataSourceUtils;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JdbcPostRepository implements PostRepository {

    private DataSource dataSource;

    public JdbcPostRepository(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public Post save(Post post) {
        String sql = "insert into post(title, content) values (?, ?)";
        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            conn = getConnection();
            pstmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            pstmt.setString(1, post.getTitle());
            pstmt.setString(2, post.getContent());
            int rs = pstmt.executeUpdate();
            if (rs == 1)
                return post;
            else
                return null;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        } finally {
            close(conn, pstmt, null);
        }
    }

    @Override
    public Long delete(Long id) {
        String sql = "delete from post where id = ?";
        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            conn = getConnection();
            pstmt = conn.prepareStatement(sql);
            pstmt.setLong(1, id);
            int rs = pstmt.executeUpdate();
            if(rs == 1) return id;
            else return null;

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        } finally {
            close(conn, pstmt, null);
        }
    }

    @Override
    public Post update(Post post) {
        String sql = "update post set title = ?, content = ? where id = ?";
        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            conn = getConnection();
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, post.getTitle());
            pstmt.setString(2, post.getContent());
            pstmt.setLong(3, post.getId());
            int rs = pstmt.executeUpdate();
            if (rs == 1)
                return post;
            else
                return null;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        } finally {
            close(conn, pstmt, null);
        }
    }

    @Override
    public List<Post> findAll() {
        String sql = "select * from post";
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            conn = getConnection();
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();
            List<Post> posts = new ArrayList<>();
            while(rs.next()) {
                Post post = new Post();
                post.setId(rs.getLong("id"));
                post.setTitle(rs.getString("title"));
                post.setContent(rs.getString("content"));
                posts.add(post);
            }
            return posts;

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        } finally {
            close(conn, pstmt, rs);
        }
    }

    @Override
    public Post findById(Long id) {
        String sql = "select * from post where id = ?";
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            conn = getConnection();
            pstmt = conn.prepareStatement(sql);
            pstmt.setLong(1, id);
            rs = pstmt.executeQuery();
            Post post = new Post();
            while(rs.next()) {
                post.setId(rs.getLong("id"));
                post.setTitle(rs.getString("title"));
                post.setContent("content");
            }
            return post;

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        } finally {
            close(conn, pstmt, rs);
        }
    }

    private Connection getConnection() {
        return DataSourceUtils.getConnection(dataSource);
    }

    private void close(Connection conn, PreparedStatement pstmt, ResultSet rs) {
        try{
            if(conn != null) conn.close();
            if(pstmt != null) pstmt.close();
            if(rs != null) rs.close();
        } catch (SQLException e) {
            System.out.println("JDBC Error");
        }

    }
}
