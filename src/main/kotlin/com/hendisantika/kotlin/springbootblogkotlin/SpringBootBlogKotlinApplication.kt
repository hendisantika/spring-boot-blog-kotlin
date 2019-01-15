package com.hendisantika.kotlin.springbootblogkotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.web.config.EnableSpringDataWebSupport

@SpringBootApplication
@EnableSpringDataWebSupport
class SpringBootBlogKotlinApplication

fun main(args: Array<String>) {
    runApplication<SpringBootBlogKotlinApplication>(*args)
}

