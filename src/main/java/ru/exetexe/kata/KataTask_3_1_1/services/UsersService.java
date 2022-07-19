package ru.exetexe.kata.KataTask_3_1_1.services;


import ru.exetexe.kata.KataTask_3_1_1.models.User;

import java.util.List;

public interface UsersService {

    public List<User> findAll();

    public User findOne(Long id);

    public void save(User user);

    public void delete(Long id);

    void update(Long id, User user);
}
