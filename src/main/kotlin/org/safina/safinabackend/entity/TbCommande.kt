package org.safina.safinabackend.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity

class TbCommande (
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO) val id: Long? = null,
        val produit: String = "",
        val datelivraison: String = "",
        val type: String = "",
        val quantite: Int =0,
        val etat: Boolean = true,
        val idMEmbre : Long =0,
        val prixtotal: Double =0.0

)