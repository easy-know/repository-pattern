package com.paul.career

interface CareerRepository {
    fun submit(careerVM: CareerViewModel)
    fun findMyCareer(uuid: String)
}