package com.example.userms.service;

import com.example.userms.dto.UserActionDTO;
import com.example.userms.feign.NotificationClient;
import com.example.userms.model.User;
import com.example.userms.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    @Autowired
    private NotificationClient client;

    public User createUser(User user) {
        User saved = repo.save(user);
        client.sendNotification(new UserActionDTO(saved, "Created"));
        return saved;
    }

    public User updateUser(Long id, User userData) {
        User existing = repo.findById(id).orElseThrow();
        existing.setUsername(userData.getUsername());
        existing.setPassword(userData.getPassword());
        existing.setAddress(userData.getAddress());
        User updated = repo.save(existing);
        client.sendNotification(new UserActionDTO(updated, "Updated"));
        return updated;
    }

    public void deleteUser(Long id) {
        User user = repo.findById(id).orElseThrow();
        repo.delete(user);
        client.sendNotification(new UserActionDTO(user, "Deleted"));
    }

    public List<User> getAllUsers() {
        return repo.findAll();
    }
}
