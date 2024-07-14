package com.example.demo2.repository;

import com.example.demo2.entity.PostDTO;

import java.sql.*;

public class PostDAO {
    private Connection connection;

    public PostDAO(Connection connection) {
        this.connection = connection;
    }

    public PostDTO findById(Long id) throws SQLException {
        String query = "SELECT * FROM post WHERE id = ?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setLong(1, id);
        ResultSet resultSet = statement.executeQuery();

        if (resultSet.next()) {
            PostDTO post = new PostDTO();
            post.setId(resultSet.getLong("id"));
            post.setTitle(resultSet.getString("title"));
            post.setContent(resultSet.getString("content"));
            return post;
        } else {
            return null;
        }
    }

    public void save(PostDTO post) throws SQLException {
        String query = "INSERT INTO post (title, content) VALUES (?, ?)";
        PreparedStatement statement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
        statement.setString(1, post.getTitle());
        statement.setString(2, post.getContent());
        statement.executeUpdate();

        ResultSet generatedKeys = statement.getGeneratedKeys();
        if (generatedKeys.next()) {
            post.setId(generatedKeys.getLong(1));
        }
    }

    // 기타 필요한 메서드들...
}
