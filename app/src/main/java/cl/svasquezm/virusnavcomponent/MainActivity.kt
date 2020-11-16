package cl.svasquezm.virusnavcomponent

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import cl.svasquezm.virusnavcomponent.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bottomNavigationView.setOnNavigationItemSelectedListener {
            findNavController(R.id.nav_host_fragment).navigate(
                when (it.itemId) {
                    R.id.item_home -> R.id.action_global_virusListFragment
                    R.id.item_help -> R.id.action_global_noImplementedFragment
                    else -> throw Exception("No valid destination")
                }
            )

            false
        }
    }
}
