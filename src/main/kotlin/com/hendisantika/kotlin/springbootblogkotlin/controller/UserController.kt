package com.hendisantika.kotlin.springbootblogkotlin.controller

import com.hendisantika.kotlin.springbootblogkotlin.entity.User
import com.hendisantika.kotlin.springbootblogkotlin.repository.UserRepository
import org.springframework.data.domain.Pageable
import org.springframework.data.web.PagedResourcesAssembler
import org.springframework.hateoas.PagedResources
import org.springframework.hateoas.Resource
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-blog-kotlin
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-01-16
 * Time: 06:49
 * To change this template use File | Settings | File Templates.
 */
@RestController
@RequestMapping("/users")
class UserController(
        private val userRepository: UserRepository,
        private val userResourceAssembler: UserResourceAssembler) {

    @GetMapping
    fun getUsers(pageable: Pageable,
                 pagedResourcesAssembler: PagedResourcesAssembler<User>): PagedResources<Resource<User>> {
        val users = userRepository.findAll(pageable)
        return pagedResourcesAssembler.toResource(users, this.userResourceAssembler)
    }

    @GetMapping("/{id}")
    fun getUser(id: Long): Resource<Optional<User>> {
        return Resource(userRepository.findById(id))
    }
}