package com.skel.csm.service

import org.springframework.kafka.annotation.KafkaListener
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Component

@Component
class KafkaService(
    private val kafkaTemplate: KafkaTemplate<String, String>
) {

    @KafkaListener(topics=["board_topic"])
    fun subscribe(content: String?) {
        println (">>>>> Kafka <<<<<< $content")
    }

    fun publish(content: String?) {
        kafkaTemplate.send("board_topic", "$content")
    }

}