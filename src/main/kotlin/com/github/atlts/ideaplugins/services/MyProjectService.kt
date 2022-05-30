package com.github.atlts.ideaplugins.services

import com.intellij.openapi.project.Project
import com.github.atlts.ideaplugins.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
