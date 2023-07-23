package com.skel.csm

import com.skel.csm.service.KafkaService
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class CsmApplicationTests(
	@Autowired val kafkaService: KafkaService
) {

	@Test
	fun contextLoads() {
		kafkaService.publish("blahblah!!!@!@")
	}

}
