package cl.svasquezm.virusnavcomponent.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import cl.svasquezm.virusnavcomponent.data.VirusDatabase
import cl.svasquezm.virusnavcomponent.databinding.FragmentVirusDetailsBinding

class VirusDetailsFragment : Fragment() {
    private val args by navArgs<VirusDetailsFragmentArgs>()
    private lateinit var binding: FragmentVirusDetailsBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentVirusDetailsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val virus = VirusDatabase.getVirus(args.virusId)

        binding.title.text = virus.name
        binding.type.text = "Type: ${virus.type}"
        binding.description.text = virus.description
    }
}
