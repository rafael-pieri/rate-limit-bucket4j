package com.example.ratelimitbucket4j.configuration

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.HttpMethod

@Configuration
class Bucket4jConfiguration {

    @Bean
    fun cacheKeys() = mapOf(
        "getEntry" to HttpMethod.GET.name(),
        "createEntry" to HttpMethod.POST.name(),
        "updateEntry" to HttpMethod.PUT.name(),
        "deleteEntry" to HttpMethod.DELETE.name(),
    )
}
