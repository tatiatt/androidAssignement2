package ge.ttataevi.androidassignement2.domain.useCase

import ge.ttataevi.androidassignement2.domain.model.City
import ge.ttataevi.androidassignement2.domain.repository.WeatherAppRepo
import javax.inject.Inject

class GetCurrentCityWeatherUseCase @Inject constructor(
    private val weatherAppRepo: WeatherAppRepo
) {
    suspend operator fun invoke(
        cityName: String
    ): City? {
        return weatherAppRepo.getCurrentWeatherCity(
            cityName
        ).getOrNull()
    }
}