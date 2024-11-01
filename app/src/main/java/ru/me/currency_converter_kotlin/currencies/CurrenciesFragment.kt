package ru.me.currency_converter_kotlin.currencies

import androidx.fragment.app.viewModels
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ru.me.currency_converter_kotlin.R

class CurrenciesFragment : Fragment() {

    companion object {
        fun newInstance() = CurrenciesFragment()
    }

    private val viewModel: CurrenciesViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // TODO: Use the ViewModel
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_currencies, container, false)
    }
}