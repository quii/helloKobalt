@file:JvmName("main")
package com.quii.hellokobalt.app

import com.quii.hellokobalt.lib.helloHandler
import org.http4k.core.Method
import org.http4k.routing.bind
import org.http4k.routing.routes
import org.http4k.server.Jetty
import org.http4k.server.asServer

fun main(args: Array<String>) {

    val port = if (args.isNotEmpty()) args[0].toInt() else 5000
    val app = routes("/" to Method.GET bind helloHandler)

    print("Listening on $port")

    app.asServer(Jetty(port)).startAndBlock()
}