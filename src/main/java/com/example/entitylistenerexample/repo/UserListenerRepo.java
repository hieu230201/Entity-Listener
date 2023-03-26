package com.example.entitylistenerexample.repo;

import com.example.entitylistenerexample.entity.UserListenerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Description:
 *
 * @author: hieu
 * @since: 25/03/2023
 * Project_name: com.example.entitylistenerexample.repo
 */
@Repository
public interface UserListenerRepo extends JpaRepository<UserListenerEntity, Long> {
}
