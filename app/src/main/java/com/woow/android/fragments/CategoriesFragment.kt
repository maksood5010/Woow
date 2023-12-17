package com.woow.android.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.woow.android.R
import com.woow.android.databinding.FragmentCategoriesBinding

class CategoriesFragment : BaseFragment() {

	val binding: FragmentCategoriesBinding by lazy { FragmentCategoriesBinding.inflate(layoutInflater)}

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
	}

	override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
		// Inflate the layout for this fragment
		return binding.root
	}

	override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
		super.onViewCreated(view, savedInstanceState)
//		getMainActivity().selectNavBar(R.id.nav_cat)
	}


}