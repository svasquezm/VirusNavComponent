package cl.svasquezm.virusnavcomponent.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import cl.svasquezm.virusnavcomponent.adapters.VirusListAdapter
import cl.svasquezm.virusnavcomponent.data.VirusDatabase
import cl.svasquezm.virusnavcomponent.data.VirusType
import cl.svasquezm.virusnavcomponent.databinding.FragmentVirusListBinding

class VirusListFragment : Fragment() {

    private lateinit var binding: FragmentVirusListBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentVirusListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter = VirusListAdapter(VirusDatabase.viruses) {
            if(it.type == VirusType.INS) {
                findNavController().navigate(VirusListFragmentDirections.actionVirusListFragmentToNotFoundFragment())
            } else {
                findNavController().navigate(
                    VirusListFragmentDirections.actionVirusListFragmentToVirusDetailsFragment(
                        it.id
                    )
                )
            }
        }

        binding.recyclerView.adapter = adapter
    }
}
