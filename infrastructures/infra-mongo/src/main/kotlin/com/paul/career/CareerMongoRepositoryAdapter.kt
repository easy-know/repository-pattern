package com.paul.career

import org.springframework.context.annotation.Primary
import org.springframework.stereotype.Component

@Component
@Primary
class CareerMongoRepositoryAdapter : CareerRepository {
    override fun submit(careerVM: CareerViewModel) {
        TODO("Not yet implemented")
    }
}