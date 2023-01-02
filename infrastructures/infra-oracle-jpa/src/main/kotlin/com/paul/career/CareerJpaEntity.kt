package com.paul.career

import jakarta.persistence.*
import org.hibernate.annotations.DynamicInsert
import org.hibernate.annotations.DynamicUpdate

@Entity
@Table
@DynamicInsert
@DynamicUpdate
class CareerJpaEntity(
    @Column(length = 300)
    var contents: String
) {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long? = null
}