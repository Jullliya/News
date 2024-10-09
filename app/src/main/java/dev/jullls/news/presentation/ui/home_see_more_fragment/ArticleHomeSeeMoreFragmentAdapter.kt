package dev.jullls.news.presentation.ui.home_see_more_fragment

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import dev.jullls.news.R
import dev.jullls.news.databinding.ItemArticleFragmentExploreBinding
import dev.jullls.news.presentation.ui.Article

class ArticleHomeSeeMoreFragmentAdapter(private val articleList: List<Article>) :
    RecyclerView.Adapter<ArticleHomeSeeMoreFragmentAdapter.ArticleViewHolder>() {

    class ArticleViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val binding = ItemArticleFragmentExploreBinding.bind(view)

        fun bind(article: Article) {
            with(binding) {
                ivItemArticleCard.setImageResource(article.image)
                tvItemArticleCardTitle.text = article.name
                ivAuthorPortrait.setImageResource(article.author)
                tvInformation.text = article.information
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArticleViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(
            R.layout.item_article_fragment_explore, parent, false
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