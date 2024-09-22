package dev.jullls.news.presentation.ui.bookmark_fragment

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import dev.jullls.news.R
import dev.jullls.news.databinding.ItemArticleFragmentExploreBinding
import dev.jullls.news.presentation.ui.Article

class ArticleBookmarkFragmentAdapter(private val articleList: List<Article>) :
    RecyclerView.Adapter<ArticleBookmarkFragmentAdapter.ArticleViewHolder>() {

    class ArticleViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val binding = ItemArticleFragmentExploreBinding.bind(view)

        fun bind(article: Article) {
            with(binding) {
                ivItemArticleCard.setImageResource(R.drawable.article_card_1)
                tvItemArticleCardTitle.text = article.name

            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArticleViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(
            R.layout.fragment_bookmark, parent, false
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