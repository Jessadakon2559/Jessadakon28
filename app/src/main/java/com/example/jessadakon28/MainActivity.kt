package com.example.jessadakon28

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //ซ่อน Title bar
        supportActionBar?.hide()

        //การดักจับ
        btn_cc.setOnClickListener(View.OnClickListener {

            img_img.setImageDrawable(getDrawable(R.drawable.cm))
            tv_header.setText("จังหวัด "+getString(R.string.btn_cc))
            tv_vi.setText(getString(R.string.content_cc))
            Toast.makeText(this,"ยินดีต้อนรับสู่จังหวัด"+getString(R.string.btn_cc),Toast.LENGTH_LONG).show()

        })

        //การดักจับ
        btn_su.setOnClickListener(View.OnClickListener {

            img_img.setImageDrawable(getDrawable(R.drawable.suk))
            tv_header.setText("จังหวัด "+getString(R.string.btn_su))
            tv_vi.setText(getString(R.string.content_su))
            Toast.makeText(this,"ยินดีต้อนรับสู่จังหวัด"+getString(R.string.btn_su),Toast.LENGTH_LONG).show()

        })

        //การดักจับ
        btn_cr.setOnClickListener(View.OnClickListener {

            img_img.setImageDrawable(getDrawable(R.drawable.cr))
            tv_header.setText("จังหวัด "+getString(R.string.btn_cr))
            tv_vi.setText(getString(R.string.content_cr))
            Toast.makeText(this,"ยินดีต้อนรับสู่จังหวัด"+getString(R.string.btn_cr),Toast.LENGTH_LONG).show()
        })

        //การดักจับ
        btn_lp.setOnClickListener(View.OnClickListener {

            img_img.setImageDrawable(getDrawable(R.drawable.lp))
            tv_header.setText("จังหวัด "+getString(R.string.btn_lp))
            tv_vi.setText(getString(R.string.content_lp))
            Toast.makeText(this,"ยินดีต้อนรับสู่จังหวัด"+getString(R.string.btn_lp),Toast.LENGTH_LONG).show()

        })

    }
}
