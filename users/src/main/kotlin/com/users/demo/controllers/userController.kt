package com.users.demo.controllers

import com.users.demo.models.User
import com.users.demo.services.UserService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController(val userService: UserService) {

    @GetMapping("/users")
    fun getUsers(): List<User> {
        return userService.findAll()
    }
}