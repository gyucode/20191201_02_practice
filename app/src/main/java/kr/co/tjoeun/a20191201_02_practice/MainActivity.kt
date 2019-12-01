package kr.co.tjoeun.a20191201_02_practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginBtn.setOnClickListener {
            var inputId = idEdt.text.toString()
            var inputPw = pwEdt.text.toString()

            if(inputId == "admin" && inputPw == "123")
            {
                Toast.makeText( this, "관리자입니다",Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText( this, "일반사용자입니다",Toast.LENGTH_SHORT).show()
            }
        }

    }
}
