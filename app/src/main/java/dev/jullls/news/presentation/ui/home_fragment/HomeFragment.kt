package dev.jullls.news.presentation.ui.home_fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import dev.jullls.news.R
import dev.jullls.news.databinding.FragmentHomeBinding
import dev.jullls.news.presentation.ui.Article

class HomeFragment: Fragment(R.layout.fragment_home) {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    private val articleListHome = listOf(
        Article(
            1,
            R.drawable.article_card_1,
            "Experience the Serenity of Japan's Traditional Countryside",
            "Technology",
            0,
            ""
        ),
        Article(
            2,
            R.drawable.article_card_2,
            "Discovering the Magic of Paris: A Journey through",
            "Technology",
            0,
            ""
        )
    )

    private val articleListJustForYou = listOf(
        Article(
            3,
            R.drawable.article_card_3,
            "The Pros and Cons of Remote Work",
            "Technology",
            0,
            ""
        ),
        Article(
            4,
            R.drawable.article_card_4,
            "The Pros and Cons of Remote Work",
            "Technology",
            0,
            ""
        )
    )

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupUI()
        setupListeners()
    }

    private fun setupListeners() {
//        with(binding) {
//            btnMenuExploreFragmentHome.setOnClickListener {
//                findNavController().navigate(R.id.action_navigation_bookmark_to_navigation_explore)
//            }
//            btnMenuBookmarkFragmentHome.setOnClickListener{
//                findNavController().navigate(R.id.action_navigation_home_to_navigation_bookmark)
//            }
//        }
    }

    private fun setupUI(){
        setupRecyclerArticleHome()
        setupRecyclerArticleJustForYou()
    }

    private fun setupRecyclerArticleHome(){
        with(binding) {
            rvArticlesHome.setHasFixedSize(true)
            rvArticlesHome.layoutManager =
                LinearLayoutManager(requireContext(), RecyclerView.HORIZONTAL, false)
            rvArticlesHome.adapter = ArticleHomeFragmentAdapter(articleListHome)
        }
    }

    private fun setupRecyclerArticleJustForYou(){
        with(binding) {
            rvArticlesJustForYou.setHasFixedSize(true)
            rvArticlesJustForYou.layoutManager =
                LinearLayoutManager(requireContext(), RecyclerView.HORIZONTAL, false)
            rvArticlesJustForYou.adapter = ArticleHomeFragmentAdapter(articleListJustForYou)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}