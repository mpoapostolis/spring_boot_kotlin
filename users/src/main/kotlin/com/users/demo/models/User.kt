package com.users.demo.models

import java.sql.Timestamp
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "user_table")
class User(
        @Id @Column(name = "user_id") val user_id: Int,
        val user_name: String,
        val first_name: String,
        val last_name: String,
        val age: Int,
        val created_at: Timestamp,
        val updated_at: Timestamp
)