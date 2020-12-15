package ru.ought.kotestspring;

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class User(
    var firstName: String,
    var lastName: String,
    @Id @GeneratedValue var id: Long? = null
)
