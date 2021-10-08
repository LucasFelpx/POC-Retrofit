package com.example.pocretrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getData()
    }

    fun getData() {
        val retrofitClient = NetworkUtils
            .getRetrofitInstance("https://bino.iotruck.com.br")

        val endpoint = retrofitClient.create(Endpoint::class.java)

        val callback = endpoint.getPosts()

        callback.enqueue(object : Callback<List<Posts>> {
            override fun onResponse(call: Call<List<Posts>?>, response: Response<List<Posts>?>) {
                response.body()?.forEach {
                    id_texto.text = id_texto.text.toString().plus(it.name)
                }
            }

            override fun onFailure(call: Call<List<Posts>?>, t: Throwable) {
                Toast.makeText(baseContext, t.message, Toast.LENGTH_SHORT).show()
            }
        })
    }



}