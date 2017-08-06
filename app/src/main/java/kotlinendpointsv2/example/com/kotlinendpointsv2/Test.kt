package kotlinendpointsv2.example.com.kotlinendpointsv2

import com.example.echo.echo.Echo
import com.example.lib.ApiHelper

class ApiHelper(echo: Echo) : ApiHelper(echo) {

    fun test2() {
        val msg = echo.echo(null).execute()
    }

}