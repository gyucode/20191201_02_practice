package kr.co.tjoeun.a20191201_02_practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_user_info.*
import kr.co.tjoeun.a20191201_02_practice.datas.UserData

class UserInfoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_info)

        val user = intent.getSerializableExtra("userData") as UserData

        idTxt.text = user.userLoginId
        pwTxt.text = user.userLoginPw


//        val userIdFromIntent = intent.getStringExtra("userId")
//        val userPwFromIntent = intent.getStringExtra("userPw")
//        val userHeightFromIntent = intent.getDoubleExtra("userHeight", 0.1)
//        idTxt.text = userIdFromIntent
//        pwTxt.text = userPwFromIntent


    }
}
