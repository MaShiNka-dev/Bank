package tv.codealong.tutorials.springboot.demo.Model

data class Bank(
    val accountNumber: String, // Номер счета
    val trust: Double, // трастовый счет
    val transactionFee: Int // комисия за транакцию
)
