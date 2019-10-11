package org.safina.safinabackend

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SafinaBackendApplication

fun main(args: Array<String>) {
	runApplication<SafinaBackendApplication>(*args)
}
