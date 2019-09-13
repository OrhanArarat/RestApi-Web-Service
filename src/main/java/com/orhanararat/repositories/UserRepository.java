package com.orhanararat.repositories;

import com.orhanararat.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User getByName(String name);
    User getUserByIdAndStatus(Long id,int status);
    List<User> findAllByStatus(int status);

}
