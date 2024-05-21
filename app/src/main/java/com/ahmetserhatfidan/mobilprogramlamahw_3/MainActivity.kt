package com.ahmetserhatfidan.mobilprogramlamahw_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: ProductViewModel
    private lateinit var productAdapter: ProductAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this).get(ProductViewModel::class.java)

        viewModel.products.observe(this, Observer { products ->
            productAdapter = ProductAdapter(products)
            binding.recyclerView.adapter = productAdapter
        })

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
    }
}
