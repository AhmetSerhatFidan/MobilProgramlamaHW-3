interface ApiService {
    @GET("products")
    suspend fun getProducts(): List<Product>
}
