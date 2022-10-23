package app.joybox

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class VendorClientGatewayApplication

fun main(args: Array<String>) {
    runApplication<VendorClientGatewayApplication>(*args)
}
