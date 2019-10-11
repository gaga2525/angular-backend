package org.safina.safinabackend.dao

import org.safina.safinabackend.entity.*
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.query.Param
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource(collectionResourceRel = "poules", path = "poules")
interface PouleDao : CrudRepository<Poule, Long> {
    //fun findAllByQuantite(@Param("quantite") quantite: Int) : List<Poule>
}


@RepositoryRestResource(collectionResourceRel = "charcuteries", path = "charcuteries")
interface CharcuterieDao : CrudRepository<Charcuterie, Long> {
}

@RepositoryRestResource(collectionResourceRel = "penses", path = "penses")
interface PenseDao : CrudRepository<Pense, Long> {
}
@RepositoryRestResource(collectionResourceRel = "membres", path = "membres")
interface MembreDao : CrudRepository<Membre, Long> {
}
@RepositoryRestResource(collectionResourceRel = "oeufs", path = "oeufs")
interface OeufDao : CrudRepository<Oeufs, Long> {
}
@RepositoryRestResource(collectionResourceRel = "cmds", path = "cmds")
interface CmdDao : CrudRepository<TbCommande, Long> {
}