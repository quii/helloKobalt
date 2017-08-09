package com.quii.helloLib

import com.natpryce.hamkrest.and
import com.natpryce.hamkrest.should.shouldMatch
import org.http4k.core.Method
import org.http4k.core.Request
import org.http4k.core.Status.Companion.OK
import org.http4k.hamkrest.hasBody
import org.http4k.hamkrest.hasStatus
import org.junit.Test


class HelloHandlerTest{
    @Test
    fun `it says hello`() {
        helloHandler(Request(Method.GET, "/")) shouldMatch hasStatus(OK).and(hasBody("Hello, world!"))
    }
}