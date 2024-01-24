package com.example.service;

import com.example.model.User;
import com.example.repository.UserRepository;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final ExecutorService executorService;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
        this.executorService = Executors.newSingleThreadExecutor();

    }

    @Override
    public void save(User user) {
        executorService.execute(()->{
            userRepository.save(user);
        });
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id);
    }

    @PreDestroy
    public void preDestroy() {
        executorService.shutdown();
        System.out.println(getClass().getSimpleName() + "::preDestroy");
    }
}
