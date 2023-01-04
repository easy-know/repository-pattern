package com.paul.career

import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface CareerMongoRepository : MongoRepository<CareerMongoDocument, String>