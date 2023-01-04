package com.paul.career

import org.springframework.stereotype.Component

@Component
class CareerMongoRepositoryAdapter(
    private val mongoRepository: CareerMongoRepository
) : CareerRepository {
    override fun submit(careerVM: CareerViewModel) {
        val careerDocument = CareerMongoDocument(
            contents = careerVM.contents
        )
        mongoRepository.save(careerDocument)
    }

    override fun findMyCareer(uuid: String) {
        TODO("Not yet implemented")
    }
}