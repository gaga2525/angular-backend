package org.safina.agularbackend.dao

import org.safina.agularbackend.entity.*
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.query.Param
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource(collectionResourceRel = "users", path = "users")
interface UserDao : CrudRepository<User, Long> {
    fun findUserByEmail(@Param("email") nom: String): User?
}
@RepositoryRestResource(collectionResourceRel = "entres", path = "entres")
interface EntreDao : CrudRepository<entree, Long> {
    // fun findByNomAndPwd(@Param("name") nom: String, @Param("pwd") password: String): User?
}
@RepositoryRestResource(collectionResourceRel = "sorties", path = "sorties")
interface SortieDao : CrudRepository<sortie, Long> {
    // fun findByNomAndPwd(@Param("name") nom: String, @Param("pwd") password: String): User?
}
@RepositoryRestResource(collectionResourceRel = "exercices", path = "exercices")
interface ExerciceDao : CrudRepository<Exercice, Long> {
    fun findByIdUser(@Param("idUser") idUser:Long):List<Exercice>
}
