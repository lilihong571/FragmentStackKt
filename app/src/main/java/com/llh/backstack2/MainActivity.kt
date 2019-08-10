package com.llh.backstack2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //创建一个碎片实例
        val fragmentA = FragmentA();
        //添加碎片
        supportFragmentManager.beginTransaction().add(R.id.main_fragment,fragmentA,"pre").commit()
    }
}
