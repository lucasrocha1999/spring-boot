package br.com.springboot.services;

import br.com.springboot.model.User;
import br.com.springboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User create(User user) {
        return this.userRepository.save(user);
    }

    public List<User> findAll() {
        return this.userRepository.findAll();
    }

    public User findById(@Param("id") Long id) {
        Optional<User> userFind = this.userRepository.findById(id);

        if (userFind.isPresent()) {
            return userFind.get();
        }

        return null;
    }

    public List<User> findByIdGreaterThan(@Param("id") Long id) {
        return this.userRepository.findByIdGreaterThan(id);
    }

    public List<User> findByName(@Param("name") String name) {
        return this.userRepository.findByNameIgnoreCase(name);
    }
}
