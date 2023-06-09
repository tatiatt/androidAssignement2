package ge.ttataevi.androidassignement2.di

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import ge.ttataevi.androidassignement2.data.repository.WeatherAppRepoImpl
import ge.ttataevi.androidassignement2.data.source.WeatherSource
import ge.ttataevi.androidassignement2.domain.repository.WeatherAppRepo
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideOkHttpClient() = OkHttpClient.Builder()
        .addInterceptor(
            HttpLoggingInterceptor()
                .apply { setLevel(HttpLoggingInterceptor.Level.BODY) }
        )
        .build()

    @Provides
    @Singleton
    fun provideJsonSerializer(): Moshi {
        return Moshi.Builder()
            .addLast(KotlinJsonAdapterFactory())
            .build()
    }

    @Provides
    @Singleton
    fun provideRetrofit(client: OkHttpClient, moshi: Moshi): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://api.openweathermap.org/")
            .client(client)
            .addConverterFactory(MoshiConverterFactory.create(moshi))
            .build()
    }

    @Provides
    @Singleton
    fun provideHomeApi(retrofit: Retrofit): WeatherSource =
        retrofit.create(WeatherSource::class.java)

    @Provides
    @Singleton
    fun provideWeatherRepo(weatherSource: WeatherSource): WeatherAppRepo =
        WeatherAppRepoImpl(weatherSource)
}