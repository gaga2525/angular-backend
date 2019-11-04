package org.safina.safinabackend.dao

import org.safina.safinabackend.entity.*
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.query.Param
import org.springframework.data.rest.core.annotation.RepositoryRestResource
import org.springframework.data.rest.core.annotation.RestResource

@RepositoryRestResource(collectionResourceRel = "poules", path = "poules")
interface PouleDao : CrudRepository<Poule, Long> {
   fun findPouleByNom(@Param("nom")nom: String):Poule
}


@RepositoryRestResource(collectionResourceRel = "charcuteries", path = "charcuteries")
interface CharcuterieDao : CrudRepository<Charcuterie, Long> {
}

@RepositoryRestResource(collectionResourceRel = "penses", path = "penses")
interface PenseDao : CrudRepository<Pense, Long> {
}
@RepositoryRestResource(collectionResourceRel = "membres", path = "membres")
interface MembreDao : CrudRepository<Membre, Long> {
    fun findByNomAndPwd(@Param("name") nom: String, @Param("pwd") password: String): Membre?
}
@RepositoryRestResource(collectionResourceRel = "oeufs", path = "oeufs")
interface OeufDao : CrudRepository<Oeufs, Long> {
    fun findOeufsByNom(@Param("nom") nom: String):Oeufs?
}

@RepositoryRestResource(collectionResourceRel = "cmds", path = "cmds")
interface CmdDao : CrudRepository<TbCommande, Long> {
    fun findTbCommandeByIdMembre(@Param("idmembre")idmembre:Long):List<TbCommande?>
}