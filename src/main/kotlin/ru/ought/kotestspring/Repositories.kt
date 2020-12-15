package ru.ought.kotestspring

import org.springframework.data.repository.CrudRepository

interface UserRepository: CrudRepository<User, Long> {
    fun findByFirstName(login: String): User?
}