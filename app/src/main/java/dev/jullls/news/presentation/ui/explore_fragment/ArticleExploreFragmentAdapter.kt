package dev.jullls.news.presentation.ui.explore_fragment

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import dev.jullls.news.R
import dev.jullls.news.databinding.ItemArticleFragmentExploreBinding
import dev.jullls.news.presentation.ui.Article

class ArticleExploreFragmentAdapter(private val articleList: List<Article>) :
    RecyclerView.Adapter<ArticleExploreFragmentAdapter.ArticleViewHolder>() {

    class ArticleViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val binding = ItemArticleFragmentExploreBinding.bind(view)

        fun bind(article: Article) {
            with(binding) {
                ivItemArticleCard.setImageResource(R.drawable.article_card_1)
                tvItemArticleCardTitle.text = article.name
                ivAuthorPortrait.setImageResource(R.drawable.article_author_portrait)
                tvInformation.text = article.information
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArticleViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(
            R.layout.fragment_explore, parent, false
        )
        return ArticleViewHolder(view)
    }

    override fun getItemCount(): Int {
        return articleList.size
    }

    override fun onBindViewHolder(holder: ArticleViewHolder, position: Int) {
        val actor = articleList[position]
        holder.bind(actor)
    }
}