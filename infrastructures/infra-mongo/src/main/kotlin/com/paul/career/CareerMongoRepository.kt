package com.paul.career

import org.springframework.data.mongodb.repository.MongoRepository

interface CareerMongoRepository : MongoRepository<CareerMongoDocument, String>