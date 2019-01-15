package com.hendisantika.kotlin.springbootblogkotlin.entity

import javax.persistence.*

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-blog-kotlin
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-01-16
 * Time: 06:34
 * To change this template use File | Settings | File Templates.
 */
@MappedSuperclass
@Access(AccessType.FIELD)
abstract class Model {
    @field:Id
    @field:GeneratedValue
    var id: Long? = null
}