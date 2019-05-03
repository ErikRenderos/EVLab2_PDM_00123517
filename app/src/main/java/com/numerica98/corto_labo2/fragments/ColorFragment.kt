package com.numerica98.corto_labo2.fragments

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.numerica98.corto_labo2.R
import kotlinx.android.synthetic.main.fragment_color.*
import kotlinx.android.synthetic.main.fragment_color.view.*

class ColorFragment : Fragment() {

    lateinit var color_url : Int

    companion object {

        @JvmStatic
        fun newInstance(url: Int): ColorFragment {
            val instance = ColorFragment()
            instance.color_url = url

            return instance
        }

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_color, container, false)
        view.Linear_ColorHolder.setBackgroundResource(R.color.colorPrimary)
        return view
    }


    override fun onAttach(context: Context) {
        super.onAttach(context)
    }

    override fun onDetach() {
        super.onDetach()

    }

}