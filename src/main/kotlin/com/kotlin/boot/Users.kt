package com.kotlin.boot

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import javax.ws.rs.*
import javax.ws.rs.core.MediaType

/**
 * Created by darlan.silveira on 18/07/17.
 */
@Component
@Path("/users")
open class Users {

    @Autowired
    lateinit var repository : UsersRepository

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    fun findAll() : Iterable<User> {
        return repository.findAll()
    }

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    fun findById(@PathParam("id") id: String) : User {
        return repository.findOne(id)
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    fun create(user: User) : User {
        return repository.save(user)
    }

    @PUT
    @Path("{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    fun update(@PathParam("id") id: String, user: User) : User {
        val previous = this.findById(id)
        user.id = previous.id
        return repository.save(user)
    }

    @DELETE
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    fun deleteById(@PathParam("id") id: String) : Unit {
        return repository.delete(id)
    }

}