package tv.codealong.tutorials.springboot.demo.DartaSource.Mock

import org.springframework.stereotype.Repository
import tv.codealong.tutorials.springboot.demo.DartaSource.BankDataSource
import tv.codealong.tutorials.springboot.demo.Model.Bank

@Repository
class MockBankDataSource: BankDataSource {
    override fun getBanks(): Collection<Bank> {
        TODO("Not yet implemented")
    }
}