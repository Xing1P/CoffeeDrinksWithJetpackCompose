package com.alexzh.coffeedrinks.di

import com.alexzh.coffeedrinks.data.CoffeeDrinkRepository
import com.alexzh.coffeedrinks.data.RuntimeCoffeeDrinkRepository
import com.alexzh.coffeedrinks.ui.router.AppRouter
import com.alexzh.coffeedrinks.ui.router.Router
import com.alexzh.coffeedrinks.ui.screen.coffeedetails.mapper.CoffeeDrinkDetailMapper
import com.alexzh.coffeedrinks.ui.screen.coffeedrinks.mapper.CoffeeDrinkItemMapper
import com.alexzh.coffeedrinks.ui.screen.order.mapper.OrderCoffeeDrinkMapper
import kotlinx.coroutines.ExperimentalCoroutinesApi
import org.koin.dsl.module

val dataModule = module {
    single<CoffeeDrinkRepository> { RuntimeCoffeeDrinkRepository }
}

val mapperModule = module {
    factory { CoffeeDrinkItemMapper() }
    factory { CoffeeDrinkDetailMapper() }
    factory { OrderCoffeeDrinkMapper() }
}

@ExperimentalCoroutinesApi
val routerModule = module {
    factory<Router> { AppRouter() }
}
