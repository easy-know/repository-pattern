package com.paul.career

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty
import org.springframework.stereotype.Component

@Component
@ConditionalOnProperty("career.infra", havingValue = "oracle")
class CareerJpaRepositoryAdapter(
    private val careerJpaRepository: CareerJpaRepository
) : CareerRepository {
    override fun submit(careerVM: CareerViewModel) {
        val careerEntity = CareerJpaEntity(
            contents = careerVM.contents
        )
        careerJpaRepository.save(
            careerEntity
        )
    }

    override fun findMyCareer(uuid: String) {
        TODO("Not yet implemented")
    }
}