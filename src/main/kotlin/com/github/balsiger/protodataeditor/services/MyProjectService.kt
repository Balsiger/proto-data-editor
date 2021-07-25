package com.github.balsiger.protodataeditor.services

import com.github.balsiger.protodataeditor.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
