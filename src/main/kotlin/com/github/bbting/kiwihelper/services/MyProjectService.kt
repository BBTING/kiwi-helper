package com.github.bbting.kiwihelper.services

import com.github.bbting.kiwihelper.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
