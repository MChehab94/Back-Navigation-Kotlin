package mchehab.com.backbuttonnavigation

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager

/**
 * Created by muhammadchehab on 12/20/17.
 */
object Globals {

    fun addFragment(fragmentManager: FragmentManager, fragment: Fragment, id: Int){
        fragmentManager.beginTransaction().add(id, fragment).addToBackStack(null).commit()
    }
}