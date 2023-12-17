package com.woow.android

import android.os.Bundle
import androidx.activity.OnBackPressedCallback
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.fragment.app.Fragment
import com.woow.android.databinding.ActivityMainBinding
import com.woow.android.fragments.CategoriesFragment
import com.woow.android.fragments.HomeFragment


class MainActivity : AppCompatActivity() {
	val binding:ActivityMainBinding by lazy { ActivityMainBinding.inflate(layoutInflater)}

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(binding.root)

		binding.bottomNavigation.setOnNavigationItemSelectedListener { item ->
			val id: Int = item.getItemId()
			when (id) {
				R.id.nav_home -> {
					replaceFragment(HomeFragment(),false)
				}
				R.id.nav_cat -> {
					replaceFragment(CategoriesFragment(),false)
				}
			}

			// Close the drawer
			binding.drawerLayout.closeDrawer(GravityCompat.START)
			true
		}
		onBackPressedCallback.isEnabled = false

		onBackPressedDispatcher.addCallback(onBackPressedCallback)
//		selectNavBar(R.id.nav_home)
		replaceFragment(HomeFragment(),false)

	}
	fun toggleDrawer() {
		if (binding.drawerLayout.isDrawerOpen(GravityCompat.START)) {
			binding.drawerLayout.closeDrawer(GravityCompat.START)
		} else {
			binding.drawerLayout.openDrawer(GravityCompat.START)
		}
	}

	fun selectNavBar(id: Int) {
//		binding.bottomNavigation.menu.findItem(id).isChecked = true
		binding.bottomNavigation.selectedItemId = id
	}

	fun replaceFragment(fragment: Fragment, back: Boolean = true) {
		val transaction = supportFragmentManager.beginTransaction()
		if (back) {
			transaction.addToBackStack(fragment.javaClass.simpleName)
		}
		transaction.replace(binding.fragmentContainer.id, fragment)
		transaction.commit()
	}
	val onBackPressedCallback = object: OnBackPressedCallback(true) {

		override fun handleOnBackPressed() {

		}

	}


}