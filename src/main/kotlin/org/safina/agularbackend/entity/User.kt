package org.safina.agularbackend.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class User (
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO) var id: Long? = null,
        var nom: String ="",
        var prenom: String ="",
        var adresse: String ="",
        var compagnie: String ="",
        var telephone: String ="",
        var pwd: String ="",
        var solde : Double =0.0,
        var mail: String=""
)