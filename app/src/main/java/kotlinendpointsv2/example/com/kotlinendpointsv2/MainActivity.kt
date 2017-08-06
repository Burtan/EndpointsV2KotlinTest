package kotlinendpointsv2.example.com.kotlinendpointsv2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.echo.echo.Echo
import com.google.api.client.extensions.android.http.AndroidHttp
import com.google.api.client.extensions.android.json.AndroidJsonFactory

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val echo = Echo.Builder(
                AndroidHttp.newCompatibleTransport(),
                AndroidJsonFactory(),
                null)
                .build()

        val helper = ApiHelper(echo)

        helper.test()
        helper.test2()
    }

}
