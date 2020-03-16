package org.safina.agularbackend

import org.safina.agularbackend.dao.MembreDao
import org.safina.agularbackend.dao.OeufDao
import org.safina.agularbackend.dao.PenseDao
import org.safina.agularbackend.dao.PouleDao
import org.safina.agularbackend.entity.Membre
import org.safina.agularbackend.entity.Oeufs
import org.safina.agularbackend.entity.Pense
import org.safina.agularbackend.entity.Poule
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AngularBackendApplication

fun main(args: Array<String>) {
	val context = runApplication<AngularBackendApplication>(*args)
	val penseDao = context.getBean(PenseDao::class.java)

	val oeufDao = context.getBean(OeufDao::class.java)
	val membreDao = context.getBean(MembreDao::class.java)
	val pouleDao = context.getBean(PouleDao::class.java)

	val pense = Pense(id = 1, nom = "Naissance de Don Bosco", contenue = "Naisa", date = "12/12/1999")
	penseDao.save(pense)
	val membre = Membre(1,"Gaetan","Gaetan","Safina","Safina","0974684530","1234",0.0,"gaetanlwmb")
	membreDao.save(membre)
	val poule = Poule(1,"pooule","12/12/2019",40,1,50.0)
	pouleDao.save(poule)
//
	val oeufs= Oeufs(1,"Oeufs","12/12/1200",60,1,60.0)
	oeufDao.save(oeufs)
}