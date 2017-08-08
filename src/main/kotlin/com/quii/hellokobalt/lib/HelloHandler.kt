package com.quii.hellokobalt.lib

import org.http4k.core.Request
import org.http4k.core.Response
import org.http4k.core.Status

val helloHandler = { _: Request -> Response(Status.OK).body("Hello, world!") }