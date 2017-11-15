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
        // Memo: ここまではarticleが入ってる
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_article)
        val articleView = findViewById<ArticleView>(R.id.article_view)
        val webView = findViewById<WebView>(R.id.web_view)
        // TODO: article受取
//        val article: Article = intent.getParcelableExtra(ARTICLE_EXTRA)
        val article: Article = Article("dummy_id", "dummy_title", "dummy_url",
                User("dummy_user_id", "dummy_user_name", "dummy_image_url"))

        articleView.setArticle(article)
        webView.loadUrl(article.url)
    }
}
