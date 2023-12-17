package com.woow.android.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.woow.android.MainActivity
import com.woow.android.R
import com.woow.android.databinding.FragmentCategoriesBinding
import com.woow.android.databinding.FragmentHomeBinding

class HomeFragment : BaseFragment() {

	val binding: FragmentHomeBinding by lazy { FragmentHomeBinding.inflate(layoutInflater)}

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
	}

	override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
		// Inflate the layout for this fragment
		return binding.root
	}

	override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
		super.onViewCreated(view, savedInstanceState)

		val options = arrayOf("For Olaa","Dubai", "Al Ain", "Abu Dhabi")

		val adapter = ArrayAdapter(requireContext(), R.layout.spinner_view, options)
		binding.spLocation.adapter = adapter
		binding.ivDrawer.setOnClickListener {
			getMainActivity().toggleDrawer()
		}
	}

}