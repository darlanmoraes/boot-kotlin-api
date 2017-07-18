package com.kotlin.boot

import org.springframework.data.annotation.Id

/**
 * Created by darlan.silveira on 18/07/17.
 */
data class User(@Id var id: String?, var name: String, var age: Int)