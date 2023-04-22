package ge.ttataevi.androidassignement2.data.repository

import ge.ttataevi.androidassignement2.data.source.WeatherSource
import ge.ttataevi.androidassignement2.domain.model.City
import ge.ttataevi.androidassignement2.domain.repository.WeatherAppRepo
import javax.inject.Inject

class WeatherAppRepoImpl @Inject constructor(
    private val weatherSource: WeatherSource
): WeatherAppRepo {
    override suspend fun getCurrentWeatherCity(
        cityName: String,
    ): Result<City> {
        return weatherSource.getCurrentCityWeather(
            cityName,
        )
    }

}