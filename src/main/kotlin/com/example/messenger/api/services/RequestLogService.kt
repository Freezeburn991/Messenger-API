package com.example.messenger.api.services

import javax.servlet.http.HttpServletRequest

interface RequestLogService {

    fun logRequest(request: HttpServletRequest)
}