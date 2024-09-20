package com.ismailmesutmujde.kotlinbottomnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ismailmesutmujde.kotlinbottomnavigation.databinding.FragmentThirdBinding


class ThirdFragment : Fragment() {

    private lateinit var bindingThird : FragmentThirdBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        bindingThird = FragmentThirdBinding.inflate(inflater, container, false)
        val view = bindingThird.root

        return view
    }

}