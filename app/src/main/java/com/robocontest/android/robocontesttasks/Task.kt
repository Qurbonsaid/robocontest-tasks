package com.robocontest.android.robocontesttasks

data class Task(val id: Int, val name: String, val complexity: Int, val type: String) {
    constructor(id: Int, name: String, difficultly: Int) :
            this(id, name, difficultly, "")
}