package org.safina.safinabackend

import org.safina.safinabackend.dao.MembreDao
import org.safina.safinabackend.dao.OeufDao
import org.safina.safinabackend.dao.PenseDao
import org.safina.safinabackend.dao.PouleDao
import org.safina.safinabackend.entity.Membre
import org.safina.safinabackend.entity.Oeufs
import org.safina.safinabackend.entity.Pense
import org.safina.safinabackend.entity.Poule
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SafinaBackendApplication

fun main(args: Array<String>) {
	val context = runApplication<SafinaBackendApplication>(*args)
	val penseDao = context.getBean(PenseDao::class.java)

	val oeufDao = context.getBean(OeufDao::class.java)
	val membreDao = context.getBean(MembreDao::class.java)
	val pouleDao = context.getBean(PouleDao::class.java)

//	val pense = Pense(id = 1, nom = "Eric", contenue = "Content", date = "12/12/1999")
//	penseDao.save(pense)
	val membre = Membre(1,"Gaetan","Gaetan","Safina","Safina","0974684530","1234",0.0,"gaetanlwmb")
	membreDao.save(membre)
	val poule = Poule(1,"pooule","12/12/2019",40,1,50.0)
	pouleDao.save(poule)
//
	val oeufs= Oeufs(1,"Oeufs","12/12/1200",60,1,60.0)
	oeufDao.save(oeufs)
}
