package com.users.demo.services

import com.users.demo.models.User
import com.users.demo.repositories.UserRepo
import org.springframework.stereotype.Service

@Service
class UserService(val userRepo: UserRepo) {

    fun findAll(): List<User> {
        return userRepo.findAll()
    }
}