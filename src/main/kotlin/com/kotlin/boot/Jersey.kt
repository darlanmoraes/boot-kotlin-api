package com.kotlin.boot

import org.glassfish.jersey.jackson.JacksonFeature
import org.glassfish.jersey.server.ResourceConfig
import org.springframework.stereotype.Component

/**
 * Created by darlan.silveira on 18/07/17.
 */
@Component
class Jersey : ResourceConfig() {
    init {
        register(Users::class.java)
        register(JacksonFeature::class.java)
    }
}