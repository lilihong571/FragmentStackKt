package com.llh.backstack2

import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_b.*
import kotlinx.android.synthetic.main.fragment_b.view.*
import kotlinx.android.synthetic.main.fragment_c.view.*

/**
 * 项目名:    BackStack2
 * 包名:      com.llh.backstack2
 * 文件名:    FragmentA
 * 创建者:    LLH
 * 创建时间:  2019/8/2 19:50
 * 描述:      TODO
 */
class FragmentC:Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_c,container,false)
        //Log.d("mData","mData的大小"+view.btn_comfirm)
        view.btn_comfirmC.setOnClickListener {
            var fragmentA = (activity as MainActivity).supportFragmentManager.findFragmentByTag("pre") as FragmentA?
            //Log.d("mData","mData的大小"+fragmentA)
            //获取多选框状态
            if(view.checkbox_one.isChecked){
                fragmentA!!.textA = view.checkbox_one.text.toString()
            }else{
                fragmentA!!.textA = "你没选中"
            }
            Log.d("mData","checkbox_one的选中状态"+view.checkbox_one.isChecked)
            //fragmentA!!.textA = view.et_sex.text.toString()
            (activity as MainActivity).supportFragmentManager.beginTransaction().replace(R.id.main_fragment,fragmentA!!).commit()
        }
        return view
    }
}