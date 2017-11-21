package sample.qiitaclient

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.webkit.WebView
import sample.qiitaclient.model.Article
import sample.qiitaclient.model.User
import sample.qiitaclient.view.ArticleView

class ArticleActivity : AppCompatActivity() {
    companion object {
        private const val ARTICLE_EXTRA: String = "article"
        fun intent(context: Context, article: Article): Intent =
                Intent(context, ArticleActivity::class.java).putExtra(ARTICLE_EXTRA, article)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_article)
        val articleView = findViewById<ArticleView>(R.id.article_view)
        val webView = findViewById<WebView>(R.id.web_view)
        // TODO: article受取
//        val article: Article = intent.getParcelableExtra(ARTICLE_EXTRA)
        val article: Article = Article(
                "513318a9b5b92bd56185",
                "PythonとBeautiful Soupでスクレイピング",
                "https://qiita.com/itkr/items/513318a9b5b92bd56185",
                User("itkr", "itkr", ""))

        articleView.setArticle(article)
        webView.loadUrl(article.url)
    }
}
