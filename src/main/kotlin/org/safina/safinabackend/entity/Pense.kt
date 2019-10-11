package org.safina.safinabackend.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity

class Pense (
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO) val id: Long? = null,
        val nom: String = "",
        val contenue: String = "",
        val date: String = ""
)