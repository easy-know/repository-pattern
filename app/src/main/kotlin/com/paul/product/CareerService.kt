package com.paul.product

import com.paul.career.*
import com.paul.logging.logger
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class CareerService(
    mongoRepository: CareerMongoRepositoryAdapter,
    jpaRepository: CareerJpaRepositoryAdapter?
) {
    companion object {
        lateinit var careerRepository: CareerRepository
    }

    init {
        careerRepository = jpaRepository ?: mongoRepository
        logger.info { "=============> ${careerRepository::class} <=============" }
    }

    fun submit(contents: String) {
        careerRepository.submit(CareerViewModel(contents))
    }
}