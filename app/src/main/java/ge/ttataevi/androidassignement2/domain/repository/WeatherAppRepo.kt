package ge.ttataevi.androidassignement2.domain.repository

import ge.ttataevi.androidassignement2.domain.model.City

interface WeatherAppRepo {
    suspend fun getCurrentWeatherCity(
        cityName: String
    ): Result<City>
}