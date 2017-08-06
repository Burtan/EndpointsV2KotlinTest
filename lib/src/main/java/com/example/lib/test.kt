package com.example.lib

import com.example.echo.echo.Echo

abstract class ApiHelper(val echo: Echo) {

    fun test() {
        val msg = echo.echo(null).execute()
    }

}
