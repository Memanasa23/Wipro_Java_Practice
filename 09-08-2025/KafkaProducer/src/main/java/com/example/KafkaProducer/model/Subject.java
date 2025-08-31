package com.example.KafkaProducer.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Subject {
    private String subjectCode;
    private String subjectValue;
}
