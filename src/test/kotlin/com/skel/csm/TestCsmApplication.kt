package com.skel.csm

import org.springframework.boot.fromApplication
import org.springframework.boot.test.context.TestConfiguration
import org.springframework.boot.with

@TestConfiguration(proxyBeanMethods = false)
class TestCsmApplication

fun main(args: Array<String>) {
	fromApplication<CsmApplication>().with(TestCsmApplication::class).run(*args)
}
