package com.hendisantika.kotlin.springbootblogkotlin.entity

import javax.persistence.*
import javax.validation.Valid
import javax.validation.constraints.NotNull
import javax.validation.constraints.Size
import javax.xml.bind.annotation.XmlTransient

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-blog-kotlin
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-01-16
 * Time: 06:42
 * To change this template use File | Settings | File Templates.
 */
@Entity
@NamedQueries(
        NamedQuery(name = "comment.list", query = "select c from Comment c"),
        NamedQuery(name = "comment.for.post", query = "select c from Comment c where c.post.id=:postId"))
class Comment : Model() {

    @field:NotNull
    @field:Size(min = 1)
    var author: String? = null

    @field:NotNull
    @field:Size(min = 1)
    @field:Lob
    var content: String? = null

    @field:ManyToOne
    @field:JoinColumn(name = "post_id")
    @field:Valid
    @field:XmlTransient
    var post: Post? = null
}