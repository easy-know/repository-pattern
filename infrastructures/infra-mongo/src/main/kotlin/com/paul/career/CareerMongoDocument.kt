package com.paul.career

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
class CareerMongoDocument(
    var contents: String
) {
    @Id
    var id: String? = null
}