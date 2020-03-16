package org.safina.agularbackend.entity


import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity

class Photo (
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO) val id: Long? = null,
        val chemin: String="",
        val foreignKey: Long=0

)