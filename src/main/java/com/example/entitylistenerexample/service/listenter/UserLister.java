package com.example.entitylistenerexample.service.listenter;

import com.example.entitylistenerexample.entity.UserEntity;
import com.example.entitylistenerexample.service.listenter.impl.UserListenerServiceImpl;
import com.example.entitylistenerexample.until.ApplicationContextHolder;
import jakarta.persistence.PostPersist;
import jakarta.persistence.PostUpdate;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Description:
 *
 * @author: hieu
 * @since: 25/03/2023
 * Project_name: com.example.entitylistenerexample.service.listenter
 */
public class UserLister {


    @PostPersist
    public void afterCreateNewUser (UserEntity userEntity) {
        UserListenerServiceImpl service = ApplicationContextHolder.getContext().getBean(UserListenerServiceImpl.class);
        service.insert(userEntity);
    }

    @PostUpdate
    public void afterUpdateUser (UserEntity userEntity) {
        UserListenerServiceImpl service = ApplicationContextHolder.getContext().getBean(UserListenerServiceImpl.class);
        service.update(userEntity);
    }
}
