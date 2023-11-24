object CoinExchange {
    fun getRates(): MutableMap<String, Double> {
        return mutableMapOf<String, Double>(
            "BTC" to kotlin.random.Random.nextDouble(1000.00, 50000.000),
            "ETH" to kotlin.random.Random.nextDouble(250.00, 2000.00),
            // Fake coin with fixed value for testing purposes
            "FIXED" to 100.00,
        )
    }
}
