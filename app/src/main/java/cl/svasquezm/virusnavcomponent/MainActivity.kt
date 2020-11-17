package cl.svasquezm.virusnavcomponent

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupActionBarWithNavController
import cl.svasquezm.virusnavcomponent.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        setupActionBarWithNavController(navHostFragment.navController)

        binding.bottomNavigationView.setOnNavigationItemSelectedListener {
            navHostFragment.navController.navigate(
                when (it.itemId) {
                    R.id.item_home -> MainNavigationDirections.actionGlobalVirusListFragment()
                    R.id.item_help -> MainNavigationDirections.actionGlobalNoImplementedFragment()
                    else -> throw Exception("No valid destination")
                }
            )

            false
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
