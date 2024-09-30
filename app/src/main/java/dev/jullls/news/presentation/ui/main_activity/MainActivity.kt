package dev.jullls.news.presentation.ui.main_activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dev.jullls.news.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

//        val navView: BottomNavigationView = binding.navView
//
//        val navController = findNavController(R.id.nav_host_fragment)
//
//        val appBarConfiguration = AppBarConfiguration(
//            setOf(
//                R.id.fragment_home, R.id.fragment_explore, R.id.fragment_bookmark
//            )
//        )
//        setupActionBarWithNavController(navController, appBarConfiguration)
//        navView.setupWithNavController(navController)
    }
}