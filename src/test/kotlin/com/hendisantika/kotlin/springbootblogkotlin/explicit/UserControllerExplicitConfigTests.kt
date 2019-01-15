package com.hendisantika.kotlin.springbootblogkotlin.explicit

import com.hendisantika.kotlin.springbootblogkotlin.controller.UserController
import com.hendisantika.kotlin.springbootblogkotlin.controller.UserResourceAssembler
import com.hendisantika.kotlin.springbootblogkotlin.entity.User
import com.hendisantika.kotlin.springbootblogkotlin.repository.UserRepository
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.BDDMockito.given
import org.mockito.Matchers
import org.mockito.Mockito.mock
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.context.annotation.Bean
import org.springframework.data.domain.PageImpl
import org.springframework.data.domain.Pageable
import org.springframework.data.web.config.EnableSpringDataWebSupport
import org.springframework.http.MediaType
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.result.MockMvcResultHandlers.print
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-blog-kotlin
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-01-16
 * Time: 06:54
 * To change this template use File | Settings | File Templates.
 */
@RunWith(SpringRunner::class)
@WebMvcTest(UserController::class)
class UserControllerExplicitConfigTests {

    @Autowired
    lateinit var mockMvc: MockMvc

    @Autowired
    lateinit var userRepository: UserRepository

    @Test
    fun testGetUsers() {

        this.mockMvc.perform(get("/users").param("page", "0").param("size", "1")
                .accept(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk)
    }

    @Before
    fun setUp(): Unit {
        given(userRepository.findAll(Matchers.any(Pageable::class.java)))
                .willAnswer({ invocation ->
                    val pageable = invocation.arguments[0] as Pageable
                    PageImpl(
                            listOf(
                                    User(id = 1, fullName = "one", password = "one", email = "one@one.com"),
                                    User(id = 2, fullName = "two", password = "two", email = "two@two.com"))
                            , pageable, 10)
                })
    }

    @SpringBootApplication(scanBasePackageClasses = arrayOf(UserController::class))
    @EnableSpringDataWebSupport
    class SpringConfig {

        @Bean
        fun userResourceAssembler(): UserResourceAssembler {
            return UserResourceAssembler()
        }

        @Bean
        fun userRepository(): UserRepository {
            return mock(UserRepository::class.java)
        }
    }

}