package com.hendisantika.kotlin.springbootblogkotlin.controller

import com.hendisantika.kotlin.springbootblogkotlin.entity.Post
import com.hendisantika.kotlin.springbootblogkotlin.repository.PostRepository
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-blog-kotlin
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-01-16
 * Time: 06:52
 * To change this template use File | Settings | File Templates.
 */
@RestController
@RequestMapping("/posts")
class PostController(private val postRepository: PostRepository) {

    @GetMapping
    fun getPosts(pageable: Pageable): Page<Post> {
        return this.postRepository.findAll(pageable)
    }
}