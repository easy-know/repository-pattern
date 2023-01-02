package com.paul.product

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api/career")
class CareerRestController(
    private val careerService: CareerService
) {
    @PostMapping
    fun submitCareer(@RequestBody contents: String): ResponseEntity<Any> {
        return ResponseEntity(careerService.submit(contents), HttpStatus.CREATED)
    }
}