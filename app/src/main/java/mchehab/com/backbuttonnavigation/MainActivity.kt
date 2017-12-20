package mchehab.com.backbuttonnavigation

import kotlinx.android.synthetic.main.activity_main.*
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            val firstFragment = FirstFragment()
            Globals.addFragment(supportFragmentManager, firstFragment, R.id.frameLayout)
            button.visibility = View.GONE
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        if(supportFragmentManager.backStackEntryCount == 0){
            button.visibility = View.VISIBLE
        }
    }
}
