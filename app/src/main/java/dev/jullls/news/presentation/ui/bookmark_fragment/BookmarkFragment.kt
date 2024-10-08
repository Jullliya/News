package dev.jullls.news.presentation.ui.bookmark_fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import dev.jullls.news.R
import dev.jullls.news.databinding.FragmentBookmarkBinding
import dev.jullls.news.databinding.FragmentExploreBinding
import dev.jullls.news.databinding.FragmentHomeBinding
import dev.jullls.news.presentation.ui.Article
import dev.jullls.news.presentation.ui.explore_fragment.ArticleExploreFragmentAdapter

class BookmarkFragment: Fragment(R.layout.fragment_bookmark) {

    private var _binding: FragmentBookmarkBinding? = null
    private val binding get() = _binding!!

    private val articleListBookmark = listOf(
        Article(
            9,
            R.drawable.article_card_9,
            "How to Setup Your Worksapce",
            "Interior",
            0,
            ""
        ),
        Article(
            10,
            R.drawable.article_card_10,
            "Discovering Hidden Gems: 8 Off-The-Beaten-Path Travel Destinations",
            "Travel",
            0,
            ""
        ),
        Article(
            11,
            R.drawable.article_card_11,
            "Exploring the World's Best Beaches: Top 5 Picks",
            "Travel",
            0,
            ""
        ),
        Article(
            12,
            R.drawable.article_card_12,
            "Travel Destinations That Won't Break the Bank",
            "Travel",
            0,
            ""
        ),
        Article(
            13,
            R.drawable.article_card_13,
            "How Working Remotely Will Make You More Happy",
            "Business",
            0,
            ""
        ),
        Article(
            14,
            R.drawable.article_card_14,
            "Destinations for Authentic Local Experiences",
            "Business",
            0,
            ""
        ),
        Article(
            15,
            R.drawable.article_card_15,
            "A Guide to Seasonal Gardening",
            "Travel",
            0,
            ""
        ),
        Article(
            16,
            R.drawable.article_card_15,
            "A Guide to Seasonal Gardening",
            "Travel",
            0,
            ""
        )
    )

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentBookmarkBinding.inflate(inflater, container, false)
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
//            btnMenuHomeFragmentBookmark.setOnClickListener {
//                findNavController().navigate(R.id.action_navigation_bookmark_to_navigation_home)
//            }
//            btnMenuExploreFragmentBookmark.setOnClickListener{
//                findNavController().navigate(R.id.action_navigation_bookmark_to_navigation_explore)
//            }
//        }
    }

    private fun setupUI(){
        setupRecyclerArticleBookmark()
    }

    private fun setupRecyclerArticleBookmark(){
        with(binding) {
            rvArticlesBookmark.setHasFixedSize(true)
            rvArticlesBookmark.layoutManager =
                LinearLayoutManager(requireContext(), RecyclerView.VERTICAL, false)
            rvArticlesBookmark.adapter = ArticleBookmarkFragmentAdapter(articleListBookmark)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}