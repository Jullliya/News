package dev.jullls.news.presentation.ui.main_fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import dev.jullls.news.R
import dev.jullls.news.databinding.FragmentNavigationBinding

class MainFragment: Fragment(R.layout.fragment_navigation) {

    private var _binding: FragmentNavigationBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentNavigationBinding.inflate(inflater, container, false)
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
                    R.id.navigation_home -> navHostFragment.findNavController().navigate(R.id.action_container_to_navigation_home)
                    R.id.navigation_explore -> navHostFragment.findNavController().navigate(R.id.action_container_to_navigation_explore)
                    R.id.navigation_bookmark -> navHostFragment.findNavController().navigate(R.id.action_container_to_navigation_bookmark)
                    else -> navHostFragment.findNavController().navigate(R.id.action_container_to_navigation_home)
                }
                true
            }
        }
    }

    private fun setupUi() {

    }
    
}