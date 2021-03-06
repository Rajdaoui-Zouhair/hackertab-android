package com.zrcoding.shared.di

import com.zrcoding.shared.data.repositories.PostRepository
import com.zrcoding.shared.data.repositories.PostRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {
    @Binds
    @Singleton
    abstract fun providePostRepository(
        postRepositoryImpl: PostRepositoryImpl
    ): PostRepository
}