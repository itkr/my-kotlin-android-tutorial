package sample.qiitaclient

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import sample.qiitaclient.model.Article
import sample.qiitaclient.model.User
import sample.qiitaclient.view.ArticleView

class MainActivity : AppCompatActivity() {

//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // ArticleViewオブジェクトを作成
        val articleView = ArticleView(applicationContext)
        //
        articleView.setArticle(Article(
                id = "123",
                title = "kotlin",
                url = "http://example.com/articles/123",
                user = User(id = "456", name = "XXX", profileUrl = "")))
        setContentView(articleView)
    }
}
