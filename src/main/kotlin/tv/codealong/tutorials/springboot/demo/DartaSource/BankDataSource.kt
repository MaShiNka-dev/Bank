package tv.codealong.tutorials.springboot.demo.DartaSource

import tv.codealong.tutorials.springboot.demo.Model.Bank

interface BankDataSource {
    fun getBanks():Collection<Bank>

}