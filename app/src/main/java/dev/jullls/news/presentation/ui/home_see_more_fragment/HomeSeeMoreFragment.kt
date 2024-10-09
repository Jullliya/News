package dev.jullls.news.presentation.ui.home_see_more_fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import dev.jullls.news.R
import dev.jullls.news.databinding.FragmentHomeSeeMoreBinding
import dev.jullls.news.presentation.ui.Article


class HomeSeeMoreFragment : Fragment(R.layout.fragment_home_see_more) {

    private var _binding: FragmentHomeSeeMoreBinding? = null
    private val binding get() = _binding!!

    private val articleListJustForYou = listOf(
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
            17,
            R.drawable.article_card_15,
            "A Guide to Seasonal Gardening",
            "Travel",
            0,
            ""
        ),
        Article(
            18,
            R.drawable.article_card_14,
            "Destinations for Authentic Local Experiences",
            "Business",
            0,
            ""
        ),
        Article(
            19,
            R.drawable.article_card_15,
            "A Guide to Seasonal Gardening",
            "Travel",
            0,
            ""
        ),
        Article(
            20,
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
    ): View {
        _binding = FragmentHomeSeeMoreBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupUI()
        setupListeners()
    }

    private fun setupListeners() {
        with(binding){
            ibtnBack.setOnClickListener{
                view?.findNavController()?.navigate(R.id.action_homeSeeMoreFragment_to_navigation_home)
            }
        }
    }

    private fun setupUI() {
        setupRecyclerArticleJustForYou()
    }

    private fun setupRecyclerArticleJustForYou() {
        with(binding) {
            rvArticlesJustForYou.setHasFixedSize(true)
            rvArticlesJustForYou.layoutManager =
                LinearLayoutManager(requireContext(), RecyclerView.VERTICAL, false)
            rvArticlesJustForYou.adapter = ArticleHomeSeeMoreFragmentAdapter(articleListJustForYou)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}