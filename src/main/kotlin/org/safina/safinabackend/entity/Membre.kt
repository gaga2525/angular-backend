package org.safina.safinabackend.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Membre (
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO) val id: Long? = null,
        val nom: String ="",
        val prenom: String ="",
        val adresse: String ="",
        val compagnie: String ="",
        val telephone: String ="",
        val pwd: String ="",
        var solde : Double =0.0,
        val mail: String=""
)