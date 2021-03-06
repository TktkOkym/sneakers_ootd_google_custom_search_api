package com.project.taewon.googlesearch.view.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.project.taewon.googlesearch.constants.Constants
import com.project.taewon.googlesearch.adapter.SneakersNameListAdapter
import com.project.taewon.googlesearch.model.ModelNameItem
import com.project.taewon.googlesearch.databinding.FragmentSneakersNameListBinding

/**
 * Sneakers Name List Fragment
 *
 */
class SneakersNameListFragment : Fragment() {

    private lateinit var binding: FragmentSneakersNameListBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSneakersNameListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val nameListAdapter = SneakersNameListAdapter()
        binding.nameList.apply {
            layoutManager = GridLayoutManager(context, 2)
            adapter = nameListAdapter
        }
        subscribeUi(nameListAdapter)
    }

    @Suppress("UNCHECKED_CAST")
    private fun subscribeUi(adapter: SneakersNameListAdapter) {
        arguments?.run {
            val itemList = get(Constants.BUNDLE_NAME_LIST) as List<ModelNameItem>
            adapter.submitList(itemList)
        }
    }
}
