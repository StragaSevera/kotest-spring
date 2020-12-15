package ru.ought.kotestspring

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager
import org.springframework.transaction.annotation.Transactional

@DataJpaTest
@Transactional
class RepositoriesTests(
    val entityManager: TestEntityManager,
    val userRepository: UserRepository
) : FunSpec({
    test("findByFirstName returns User") {
        val user = User("Ivan", "Petroff")
        entityManager.persist(user)
        entityManager.flush()

        userRepository.findByFirstName("Ivan") shouldBe user
    }
})
