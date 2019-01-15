package com.hendisantika.kotlin.springbootblogkotlin.entity

import java.util.*
import javax.persistence.MappedSuperclass
import javax.persistence.PrePersist

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-blog-kotlin
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-01-16
 * Time: 06:41
 * To change this template use File | Settings | File Templates.
 */

@MappedSuperclass
abstract class DatedModel : Model() {
    var created: Date? = null

    @PrePersist
    fun create() {
        created = Date()
    }
}