package com.hendisantika.kotlin.springbootblogkotlin.controller

import com.hendisantika.kotlin.springbootblogkotlin.entity.User
import org.springframework.hateoas.Resource
import org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo
import org.springframework.hateoas.mvc.ResourceAssemblerSupport
import org.springframework.stereotype.Component

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-blog-kotlin
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-01-16
 * Time: 06:48
 * To change this template use File | Settings | File Templates.
 */
@Component
class UserResourceAssembler : ResourceAssemblerSupport<User?, Resource<User>> {

    override fun toResource(entity: User?): Resource<User> {
        val selflink = linkTo(UserController::class.java).slash(entity?.id).withSelfRel()
        return Resource(entity!!, selflink)
    }

    constructor() : super(UserController::class.java, Resource::class.java as Class<Resource<User>>)

}