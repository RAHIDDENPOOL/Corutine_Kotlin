package com.example.corutine_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.coroutines.*


class MainActivity : AppCompatActivity() {
    @OptIn(DelicateCoroutinesApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        GlobalScope.launch {
            val networkCallAnswer = doNetworkCall()
            val networkCallAnswer2 = doNetworkCall2()
            println("ответ из нетворкансвера")
            println("ответ из нетворкансвера2")
        }
    }

    suspend fun doNetworkCall(): String {
        delay(3000L)
        return "This is my Answer"
    }

    suspend fun doNetworkCall2(): String {
        delay(3000L)
        return "This is my Answer"
    }

}