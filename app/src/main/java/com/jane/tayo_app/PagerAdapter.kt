package com.jane.tayo_app

import android.support.v4.view.PagerAdapter
import android.view.View

class pagerAdapter :  PagerAdapter() {

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getCount(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun instantiateItem(container: View, position: Int): Any {
        return super.instantiateItem(container, position)
    }

    override fun destroyItem(container: View, position: Int, `object`: Any) {
        super.destroyItem(container, position, `object`)
    }
}