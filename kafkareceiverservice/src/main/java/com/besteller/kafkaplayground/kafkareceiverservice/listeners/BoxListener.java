package com.besteller.kafkaplayground.kafkareceiverservice.listeners;

import com.bestseller.schema.logistics.Box;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class BoxListener {
  @KafkaListener(topics = "log_example-box")
  public void listen(ConsumerRecord<Long, Box> consumerRecord) {
    System.out.println(consumerRecord.key());
    System.out.println(consumerRecord.value().getName());
  }
}
