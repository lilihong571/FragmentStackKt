package com.llh.backstack2

import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_a.*
import kotlinx.android.synthetic.main.fragment_a.view.*

/**
 * 项目名:    BackStack2
 * 包名:      com.llh.backstack2
 * 文件名:    FragmentA
 * 创建者:    LLH
 * 创建时间:  2019/8/2 19:50
 * 描述:      TODO
 */
class FragmentA:Fragment() {
    var textA = ""

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_a,container,false)

        if (textA!=""){
            view.tv_display.text = textA
        }
        //按钮监听
        view.btn_select.setOnClickListener {
            //替换碎片
            val fragmentC = FragmentC()
            (activity as MainActivity)
                .supportFragmentManager
                .beginTransaction()
                .replace(R.id.main_fragment,fragmentC,"next")
                .addToBackStack("pre")
                .commit()
            (activity as MainActivity).supportFragmentManager.executePendingTransactions()
            Log.d("StackElementCount","FragmentA="+(activity as MainActivity).supportFragmentManager.backStackEntryCount)
        }
        return view
    }
}
/*
package com.llh.backstack2

import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_a.*
import kotlinx.android.synthetic.main.fragment_a.view.*

/**
 * 项目名:    BackStack2
 * 包名:      com.llh.backstack2
 * 文件名:    FragmentA
 * 创建者:    LLH
 * 创建时间:  2019/8/2 19:50
 * 描述:      TODO
 */
class FragmentA:Fragment() {
    var textA = ""

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_a,container,false)

        if (textA!=""){
            view.tv_display.text = textA
        }
        //按钮监听
        view.btn_select.setOnClickListener {
            //替换碎片
            val fragmentB = FragmentB()
            (activity as MainActivity)
                .supportFragmentManager
                .beginTransaction()
                .replace(R.id.main_fragment,fragmentB,"next")
                .addToBackStack("pre")
                .commit()
            (activity as MainActivity).supportFragmentManager.executePendingTransactions()
            Log.d("StackElementCount","FragmentA="+(activity as MainActivity).supportFragmentManager.backStackEntryCount)
        }
        return view
    }
}
 */