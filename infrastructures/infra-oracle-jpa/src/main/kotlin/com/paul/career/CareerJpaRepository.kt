package com.paul.career

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CareerJpaRepository : JpaRepository<CareerJpaEntity, Long>