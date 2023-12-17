package com.woow.android.fragments

import androidx.fragment.app.Fragment
import com.woow.android.MainActivity

abstract class BaseFragment : Fragment() {

	fun getMainActivity(): MainActivity {

		return activity as MainActivity
	}
}