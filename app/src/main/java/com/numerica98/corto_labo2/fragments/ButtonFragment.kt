package com.numerica98.corto_labo2.fragments

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.numerica98.corto_labo2.R
import com.numerica98.corto_labo2.constants.consts
import kotlinx.android.synthetic.main.fragment_button.*
import kotlinx.android.synthetic.main.fragment_button.view.*


class ButtonFragment : Fragment() {

    private var listenerTool: ButtonsListenerTools? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_button, container, false)

        setNavigationListeners(view)
        return view
    }


    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is ButtonsListenerTools) {
            listenerTool = context
        } else {
            throw RuntimeException(context.toString() + " must implement ButtonListenerTools")
        }

    }

    private fun setNavigationListeners(view: View){
        view.Button_previous.setOnClickListener{
            listenerTool?.onClick(consts.left_ID)
        }
        view.Button_next.setOnClickListener{
            listenerTool?.onClick(consts.right_ID)
        }
    }

    override fun onDetach() {
        super.onDetach()
        listenerTool = null

    }

    interface ButtonsListenerTools {
        fun onClick(nav_direction: String)
    }




}
