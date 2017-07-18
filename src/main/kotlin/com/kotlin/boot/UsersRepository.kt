package com.kotlin.boot

import org.springframework.data.repository.CrudRepository

/**
 * Created by darlan.silveira on 18/07/17.
 */
interface UsersRepository : CrudRepository<User, String>