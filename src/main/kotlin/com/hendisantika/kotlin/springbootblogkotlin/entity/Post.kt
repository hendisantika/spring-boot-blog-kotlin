package com.hendisantika.kotlin.springbootblogkotlin.entity

import javax.persistence.*
import javax.validation.Valid
import javax.validation.constraints.NotNull
import javax.validation.constraints.Size

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-blog-kotlin
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-01-16
 * Time: 06:39
 * To change this template use File | Settings | File Templates.
 */

@Entity
@NamedQueries(NamedQuery(name = "post.list", query = "select p from Post p"))
class Post(
        @field:NotNull
        @field:Size(min = 1)
        var title: String?,

        @field:NotNull
        @field:Size(min = 1)
        @field:Lob
        var content: String?

) : DatedModel() {

    @field:ManyToOne
    @field:JoinColumn(name = "user_id")
    @field:Valid
    var user: User? = null

    constructor() : this(null, null)

}