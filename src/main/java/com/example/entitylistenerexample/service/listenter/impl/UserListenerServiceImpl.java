package com.example.entitylistenerexample.service.listenter.impl;

import com.example.entitylistenerexample.entity.UserEntity;
import com.example.entitylistenerexample.entity.UserListenerEntity;
import com.example.entitylistenerexample.repo.UserListenerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Description:
 *
 * @author: hieu
 * @since: 25/03/2023
 * Project_name: com.example.entitylistenerexample.service.listenter.impl
 */
@Service
@Configurable
public class UserListenerServiceImpl {

    @Autowired
    private UserListenerRepo userListenerRepo;

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void insert (UserEntity entity) {
        UserListenerEntity listenerEntity = new UserListenerEntity();
        listenerEntity.setAddress(entity.getAddress());
        listenerEntity.setAge(entity.getAge());
        listenerEntity.setName(entity.getName());
        userListenerRepo.save(listenerEntity);
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void update (UserEntity entity) {
        UserEntity previousState  = entity.getPreviousState(); // dùng để debug xem entity trước khi được lưu
        UserListenerEntity listenerEntity = new UserListenerEntity();
        listenerEntity.setAddress(entity.getAddress());
        listenerEntity.setAge(entity.getAge());
        listenerEntity.setName(entity.getName());
        userListenerRepo.save(listenerEntity);
    }
}
