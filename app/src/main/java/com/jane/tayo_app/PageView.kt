package com.jane.tayo_app

import android.content.Context
import android.speech.tts.TextToSpeech
import android.support.constraint.ConstraintLayout
import android.support.v4.view.PagerAdapter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class PageView : PagerAdapter {

    var con : Context
    lateinit var path : MutableList<Int>
    lateinit var list : MutableList<TayoDto>
    lateinit var inflater: LayoutInflater

    lateinit var tts : TextToSpeech

//    constructor(con: Context, path: MutableList<Int>) : super() {
//        this.con = con
//        this.path = path
//    }

    constructor(con: Context, list: MutableList<TayoDto>) : super() {
        this.con = con
        this.list = list

        tts = TextToSpeech(con, TextToSpeech.OnInitListener { tts.setLanguage(Locale.KOREAN) })
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view == `object` as ConstraintLayout
    }

    override fun getCount(): Int {
//        return path.size
        return list.size
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        var img : ImageView
        var textDesc : TextView
        inflater = con.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater


        var rv : View = inflater.inflate(R.layout.layout_fragment, container, false)
        img = rv.findViewById(R.id.imageView) as ImageView
        textDesc = rv.findViewById(R.id.textView_Name)
        img.setOnClickListener{
            tts.speak(list[position].Name, TextToSpeech.QUEUE_FLUSH, null)
        }
//        img.setImageResource(path[position])
        img.setImageResource(list[position].ImageID)
        textDesc.setText(list[position].Name)
        container!!.addView(rv)

        return rv
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container!!.removeView(`object` as ConstraintLayout)
    }
}