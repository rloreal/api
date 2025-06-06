package com.lorealconsulting.nexoretail.kotlin

import io.ktor.server.application.*
import io.ktor.http.*
import io.ktor.server.resources.*
import io.ktor.server.plugins.autohead.*
import io.ktor.server.plugins.compression.*
import io.ktor.server.plugins.contentnegotiation.*
import io.ktor.server.plugins.defaultheaders.*
import io.ktor.server.plugins.hsts.*
import com.codahale.metrics.Slf4jReporter
import io.ktor.server.metrics.dropwizard.*
import java.util.concurrent.TimeUnit
import io.ktor.server.routing.*
import io.ktor.serialization.kotlinx.json.json
import com.typesafe.config.ConfigFactory
import io.ktor.client.HttpClient
import io.ktor.client.engine.apache.Apache
import io.ktor.server.config.HoconApplicationConfig
import io.ktor.server.auth.*
import com.lorealconsulting.nexoretail.kotlin.infrastructure.*
import com.lorealconsulting.nexoretail.kotlin.apis.AdminServicesApi
import com.lorealconsulting.nexoretail.kotlin.apis.DeviceServicesApi
import com.lorealconsulting.nexoretail.kotlin.apis.FinancialServicesApi
import com.lorealconsulting.nexoretail.kotlin.apis.RetailFinancialServicesApi
import com.lorealconsulting.nexoretail.kotlin.apis.SystemServicesApi


fun Application.main() {
    install(DefaultHeaders)
    install(DropwizardMetrics) {
        val reporter = Slf4jReporter.forRegistry(registry)
            .outputTo(this@main.log)
            .convertRatesTo(TimeUnit.SECONDS)
            .convertDurationsTo(TimeUnit.MILLISECONDS)
            .build()
        reporter.start(10, TimeUnit.SECONDS)
    }
    install(ContentNegotiation) {
        json()
    }
    install(AutoHeadResponse) // see https://ktor.io/docs/autoheadresponse.html
    install(Compression, ApplicationCompressionConfiguration()) // see https://ktor.io/docs/compression.html
    install(HSTS, ApplicationHstsConfiguration()) // see https://ktor.io/docs/hsts.html
    install(Resources)
    install(Authentication) {
    }
    routing {
        AdminServicesApi()
        DeviceServicesApi()
        FinancialServicesApi()
        RetailFinancialServicesApi()
        SystemServicesApi()
    }
}
