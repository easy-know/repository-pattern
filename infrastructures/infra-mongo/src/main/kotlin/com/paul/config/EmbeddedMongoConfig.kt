package com.paul.config

import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Import
import org.springframework.context.annotation.Profile

@Profile(value = ["local"])
@Configuration
@Import(EmbeddedMongoConfig::class)
class EmbeddedMongoConfig