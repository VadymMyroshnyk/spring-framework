package com.example.repository;

import com.example.exception.NotFoundException;
import com.example.mapper.UserMapper;
import com.example.model.User;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryImpl implements UserRepository {

    private final NamedParameterJdbcTemplate jdbcTemplate;
    private final UserMapper userMapper;

    public UserRepositoryImpl(NamedParameterJdbcTemplate jdbcTemplate, UserMapper userMapper) {
        this.jdbcTemplate = jdbcTemplate;
        this.userMapper = userMapper;
    }

    @Override
    public void save(User user) {
        MapSqlParameterSource parameters = new MapSqlParameterSource()
            .addValue("name", user.getName());

        String sql = "INSERT INTO users (name) VALUES (:name)";

        jdbcTemplate.update(sql, parameters);
    }

    @Override
    public User findById(Long id) {
        MapSqlParameterSource parameters = new MapSqlParameterSource()
            .addValue("id", id);

        String sql = "SELECT id, name FROM users WHERE id = :id";

        try {
            return jdbcTemplate.queryForObject(sql, parameters, userMapper);
        } catch (Exception e) {
            throw new NotFoundException("User not found");
        }
    }
}
