package com.jane.tayo_app

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.view.PagerAdapter
import android.support.v4.view.ViewPager
import android.support.v7.app.ActionBar
import android.util.Log
import io.realm.Realm
import io.realm.RealmConfiguration
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    lateinit var mPager: ViewPager
    lateinit var realm: Realm
    var path = mutableListOf<Int>()

    var list = mutableListOf<TayoDto>()


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        //path 초기화
        init()

 /*       //Realm 초기화
        Realm.init(this)
        val config = RealmConfiguration.Builder().name("tayoDB").build()
        Realm.setDefaultConfiguration(config)
        //
        realm = Realm.getDefaultInstance()
*/
        //페이저
        mPager = findViewById(R.id.viewPager) as ViewPager

//        var adapter: PagerAdapter = PageView(this, path)
        var adapter: PagerAdapter = PageView(this, list)

        mPager.adapter = adapter
        mPager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {
            }

            override fun onPageSelected(position: Int) {
            }

            override fun onPageScrollStateChanged(state: Int) {
            }
        })

//        Picasso.get().load(R.drawable.tayo).into(mainImage);
    }

    fun init_Image() {
        val drawablesFields = com.jane.tayo_app.R.drawable::class.java!!.getFields()

        for (field in drawablesFields) {
            try {
                var cnt = 0
                if (field.getName().contains("tayo_")) {
                    Log.i("LOG_TAG", "R.drawable." + field.getName())
                    path.add(getResources().getIdentifier(field.getName(), "drawable", getPackageName()))
                }
            } catch (e: Exception) {
                e.printStackTrace()
            }

        }
    }

    fun init() {
        list.add(TayoDto("타요", R.drawable.tayo_tayo))
        list.add(TayoDto("가니", R.drawable.tayo_gani))
        list.add(TayoDto("로기", R.drawable.tayo_rogi))
        list.add(TayoDto("라니", R.drawable.tayo_rani))
        list.add(TayoDto("에어", R.drawable.tayo_air))
        list.add(TayoDto("앨리스", R.drawable.tayo_alice))
        list.add(TayoDto("앤디", R.drawable.tayo_andy))
        list.add(TayoDto("빅", R.drawable.tayo_big))
        list.add(TayoDto("봉봉", R.drawable.tayo_bongbong))
        list.add(TayoDto("부바", R.drawable.tayo_booba))
        list.add(TayoDto("불리", R.drawable.tayo_booli))
        list.add(TayoDto("씨투", R.drawable.tayo_c2))
        list.add(TayoDto("캐리", R.drawable.tayo_carrie))
        list.add(TayoDto("챔프", R.drawable.tayo_champ))
        list.add(TayoDto("쿠쿠", R.drawable.tayo_cucu))
        list.add(TayoDto("두리", R.drawable.tayo_duri))
        list.add(TayoDto("두리엄마", R.drawable.tayo_durimom))
        list.add(TayoDto("프랭크", R.drawable.tayo_frank))
        list.add(TayoDto("하나누나", R.drawable.tayo_hana))
        list.add(TayoDto("하트", R.drawable.tayo_heart))
        list.add(TayoDto("중장비", R.drawable.tayo_heavy))
        list.add(TayoDto("제리", R.drawable.tayo_jerry))
        list.add(TayoDto("조이", R.drawable.tayo_joy))
        list.add(TayoDto("킨더", R.drawable.tayo_kinder))
        list.add(TayoDto("레오", R.drawable.tayo_leo))
        list.add(TayoDto("메트", R.drawable.tayo_met))
        list.add(TayoDto("나나", R.drawable.tayo_nana))
        list.add(TayoDto("노아", R.drawable.tayo_noah))
        list.add(TayoDto("누리", R.drawable.tayo_nuri))
        list.add(TayoDto("원", R.drawable.tayo_one))
        list.add(TayoDto("패트", R.drawable.tayo_pat))
        list.add(TayoDto("피넛", R.drawable.tayo_peanut))
        list.add(TayoDto("퀵", R.drawable.tayo_quick))
        list.add(TayoDto("레이", R.drawable.tayo_ray))
        list.add(TayoDto("렉터", R.drawable.tayo_rector))
        list.add(TayoDto("루키", R.drawable.tayo_rookie))
        list.add(TayoDto("러비", R.drawable.tayo_rubby))
        list.add(TayoDto("샤인", R.drawable.tayo_shine))
        list.add(TayoDto("스카이", R.drawable.tayo_sky))
        list.add(TayoDto("스피드", R.drawable.tayo_speed))
        list.add(TayoDto("티치", R.drawable.tayo_teach))
        list.add(TayoDto("토니", R.drawable.tayo_tony))
        list.add(TayoDto("토토", R.drawable.tayo_toto))
        list.add(TayoDto("트램이", R.drawable.tayo_tram2))
        list.add(TayoDto("으라차", R.drawable.tayo_uracha))
        list.add(TayoDto("윈디", R.drawable.tayo_windy))
        list.add(TayoDto("울리", R.drawable.tayo_wooli))
    }
}
