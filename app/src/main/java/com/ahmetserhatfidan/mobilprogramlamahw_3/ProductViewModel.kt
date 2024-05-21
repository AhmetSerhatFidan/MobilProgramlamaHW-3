class ProductViewModel : ViewModel() {
    private val repository = ProductRepository()
    val products: MutableLiveData<List<Product>> = MutableLiveData()

    init {
        fetchProducts()
    }

    private fun fetchProducts() {
        viewModelScope.launch {
            val productList = repository.getProducts()
            products.postValue(productList)
        }
    }
}
