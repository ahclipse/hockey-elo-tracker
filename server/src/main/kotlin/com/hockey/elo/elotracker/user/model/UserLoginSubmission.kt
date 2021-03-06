package com.hockey.elo.elotracker.user.model

import javax.validation.constraints.NotBlank

data class UserLoginSubmission(
        @NotBlank
        val name: String,

        @NotBlank
        val rfid: String
)
