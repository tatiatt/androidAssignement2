package ge.ttataevi.androidassignement2.data.source

import ge.ttataevi.androidassignement2.common.Consts.API_KEY
import ge.ttataevi.androidassignement2.common.Consts.UNITS
import ge.ttataevi.androidassignement2.domain.model.City
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherSource {
    @GET("data/2.5/weather?")
    fun getCurrentCityWeather(
        @Query("q") cityName: String,
        @Query("appId") appId: String = API_KEY,
        @Query("units") units: String = UNITS
    ): Result<City>
}