package com.tanovai.mvvm.model

import com.tanovai.revolut.model.RatesResponse
import io.reactivex.Observable


class RepoRepository {

    fun getRates(base: String): Observable<RatesResponse> {
        return ApiClient.instance.getRates(base)
    }

    companion object {
        private var INSTANCE: RepoRepository? = null
        fun getInstance() = INSTANCE
            ?: RepoRepository().also {
                INSTANCE = it
            }
    }
}