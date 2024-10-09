package dev.jullls.news.presentation.ui.main_fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import dev.jullls.news.R
import dev.jullls.news.databinding.FragmentMainBinding
import dev.jullls.news.presentation.ui.bookmark_fragment.BookmarkFragment
import dev.jullls.news.presentation.ui.explore_fragment.ExploreFragment
import dev.jullls.news.presentation.ui.home_fragment.HomeFragment


class MainFragment : Fragment(R.layout.fragment_main) {

    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMainBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupUi()
        setupListeners()
    }

    private fun setupListeners() {
        with(binding) {
            navView.setOnItemSelectedListener {
                when (it.itemId) {
                    R.id.navigation_menu_home -> replaceFragment(HomeFragment())
                    R.id.navigation_menu_explore -> replaceFragment(ExploreFragment())
                    R.id.navigation_menu_bookmark -> replaceFragment(BookmarkFragment())
                    else -> replaceFragment(HomeFragment())
                }
                true
            }
        }

    }

    private fun setupUi() {

    }

    private fun replaceFragment(fragment: Fragment) {
        childFragmentManager.beginTransaction()
            .replace(R.id.nav_host_fragment, fragment)
            .commit()
    }
}