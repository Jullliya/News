package dev.jullls.news.presentation.ui.explore_fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import dev.jullls.news.R
import dev.jullls.news.databinding.FragmentExploreBinding
import dev.jullls.news.presentation.ui.Article

class ExploreFragment: Fragment(R.layout.fragment_explore) {

    private var _binding: FragmentExploreBinding? = null
    private val binding get() = _binding!!

    private val articleListExplore = listOf(
        Article(
            6,
            R.drawable.article_card_6,
            "Experience the Serenity of Japan's Traditional Countryside",
            "",
            R.drawable.author_card_3,
            "Hilda Friesen · May 3, 2023"
        ),
        Article(
            7,
            R.drawable.article_card_7,
            "A Journey Through Time: Discovering the Nile river",
            "",
            R.drawable.author_card_4,
            "Melissa White · May 7, 2023"
        ),
        Article(
            8,
            R.drawable.article_card_8,
            "Chasing the Northern Lights: A Winter in Finland",
            "",
            R.drawable.author_card_5,
            "Jeannie Conn · May 12, 2023"
        ),
        Article(
            9,
            R.drawable.article_card_8,
            "Chasing the Northern Lights: A Winter in Finland",
            "",
            R.drawable.author_card_5,
            "Jeannie Conn · May 12, 2023"
        )
    )

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentExploreBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupUI()
        setupListeners()
    }

    private fun setupListeners() {

    }

    private fun setupUI(){
        setupRecyclerArticleExplore()
    }

    private fun setupRecyclerArticleExplore(){
        with(binding) {
            rvArticlesExplore.setHasFixedSize(true)
            rvArticlesExplore.layoutManager =
                LinearLayoutManager(requireContext(), RecyclerView.VERTICAL, false)
            rvArticlesExplore.adapter = ArticleExploreFragmentAdapter(articleListExplore)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}