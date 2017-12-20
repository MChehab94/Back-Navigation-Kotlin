package mchehab.com.backbuttonnavigation


import kotlinx.android.synthetic.main.fragment_first.view.*
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_first.*


/**
 * A simple [Fragment] subclass.
 */
class FirstFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater!!.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        button.setOnClickListener {
            Globals.addFragment(fragmentManager, SecondFragment(), R.id.frameLayout)
        }
    }

}// Required empty public constructor
