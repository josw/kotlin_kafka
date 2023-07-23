package com.skel.csm

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CsmApplication

fun main(args: Array<String>) {
	runApplication<CsmApplication>(*args)
}
