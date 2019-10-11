package org.safina.safinabackend

import org.safina.safinabackend.dao.PenseDao
import org.safina.safinabackend.entity.Pense
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SafinaBackendApplication

fun main(args: Array<String>) {
	val context = runApplication<SafinaBackendApplication>(*args)
	val penseDao = context.getBean(PenseDao::class.java)

	val pense = Pense(id = 1, nom = "Eric", contenue = "Content", date = "12/12/1999")
	penseDao.save(pense)
}
