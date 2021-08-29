package com.neppplus.test_practice_20210829

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginBtn.setOnClickListener {
            val textId = idEdt.text.toString()
            val textPw = passwordEdt.text.toString()

            if (textId=="admin" && textPw=="qwer") {
                Toast.makeText(this, "관리자님 환영합니다.", Toast.LENGTH_SHORT).show()
            }
            else {
                Toast.makeText(this, "로그인에 실패하였습니다", Toast.LENGTH_SHORT).show()
            }

        }
    }
}