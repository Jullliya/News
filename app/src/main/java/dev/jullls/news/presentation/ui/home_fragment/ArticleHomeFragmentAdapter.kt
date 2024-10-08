package dev.jullls.news.presentation.ui.home_fragment

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import dev.jullls.news.R
import dev.jullls.news.databinding.ItemArticleFragmentHomeBinding
import dev.jullls.news.presentation.ui.Article

class ArticleHomeFragmentAdapter(private val articleList: List<Article>) :
    RecyclerView.Adapter<ArticleHomeFragmentAdapter.ArticleViewHolder>() {

        class ArticleViewHolder(view: View) : RecyclerView.ViewHolder(view) {
            private val binding = ItemArticleFragmentHomeBinding.bind(view)

            fun bind(article: Article) {
                with(binding) {
                    ivItemArticleCard.setImageResource(article.image)
                    tvItemArticleCardTitle.text = article.name
                    tvItemArticleCardSection.text = article.section
                }
            }
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArticleViewHolder {
            val view = LayoutInflater.from(parent.context).inflate(
                R.layout.item_article_fragment_home, parent, false
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