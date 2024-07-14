package com.example.week10_jdbc.repository;

import com.example.week10_jdbc.entity.PostEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class JdbcRepository {

    private final JdbcTemplate jdbcTemplate;

    public JdbcRepository(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }


    public PostEntity save(PostEntity entity) {
        SimpleJdbcInsert jdbcInsert = new SimpleJdbcInsert(jdbcTemplate);
        jdbcInsert.withTableName("post_jdbc").usingGeneratedKeyColumns("id");
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("title", entity.getTitle());
        parameters.put("content", entity.getContent());
        Number key = jdbcInsert.executeAndReturnKey(new
                MapSqlParameterSource(parameters));
        entity.setId(key.longValue());
        return entity;
    }


    public Optional<PostEntity> findById(Long id) {
        List<PostEntity> result = jdbcTemplate.query("select * from post_jdbc where id = ?", RowMapper(), id);
        return result.stream().findAny();
    }


    public Optional<PostEntity> findByName(String name) {
        List<PostEntity> result = jdbcTemplate.query("select * from post_jdbc where name = ?", RowMapper(), name);
        return result.stream().findAny();
    }


    public List<PostEntity> findAll() {
        return jdbcTemplate.query("select * from post_jdbc", RowMapper());
    }

    private RowMapper<PostEntity> RowMapper(){
        return (rs, rowNum) -> {
            PostEntity entity = new PostEntity();
            entity.setId(rs.getLong("id"));
            entity.setTitle(rs.getString("title"));
            entity.setContent(rs.getString("content"));
            return entity;
        };
    }
}