package com.example.entitylistenerexample.api;

import com.example.entitylistenerexample.entity.UserEntity;
import com.example.entitylistenerexample.entity.UserListenerEntity;
import com.example.entitylistenerexample.repo.UserListenerRepo;
import com.example.entitylistenerexample.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Description:
 *
 * @author: hieu
 * @since: 25/03/2023
 * Project_name: com.example.entitylistenerexample.api
 */
@RestController
@RequestMapping("/user")
public class CrudUserApi {

    @Autowired
    private UserRepo userRepo;


    @PostMapping("/add")
    public String add (@RequestBody UserEntity entity) {
        if (entity != null) {
            userRepo.save(entity);
        }
        return "Add User success";
    }

    @PutMapping("/update")
    public String update (@RequestBody UserEntity entity) {
        if (entity != null && entity.getId() != null) {
            UserEntity userEntity = userRepo.findById(entity.getId()).get();
            userEntity.setAge(entity.getAge());
            userEntity.setAddress(entity.getAddress());
            userEntity.setName(entity.getName());
            userRepo.save(userEntity);
        }
        return "Update User success";
    }

    @DeleteMapping("/delete")
    public String delete (@RequestParam Long id) {
        if (id != null) {
            UserEntity userEntity = userRepo.findById(id).get();
            userRepo.delete(userEntity);
        }
        return "Delete User success";
    }

}
