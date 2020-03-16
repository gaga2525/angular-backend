package org.safina.agularbackend.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity

class Oeufs (
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO) val id: Long? = null,
        val nom: String = "",
        val date: String = "",
        val quantite: Int = 0,
        val commande: Int = 0,
        val prix: Double = 0.0
)