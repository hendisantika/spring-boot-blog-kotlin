package com.hendisantika.kotlin.springbootblogkotlin.repository

import com.hendisantika.kotlin.springbootblogkotlin.entity.User
import org.springframework.data.repository.PagingAndSortingRepository

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-blog-kotlin
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-01-16
 * Time: 06:44
 * To change this template use File | Settings | File Templates.
 */
interface UserRepository : PagingAndSortingRepository<User, Long>